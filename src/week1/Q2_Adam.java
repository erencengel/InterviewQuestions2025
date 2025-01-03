package week1;

import java.util.*;

public class Q2_Adam {

    /**
     * count of substrings having all distinct characters
     */

    public static void main(String[] args) {
        String input = "gffg";
        int output = countDistinctSubstrings(input);
        System.out.println("output = " + output);
    }

    private static int countDistinctSubstrings(String input) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String temp = input.substring(i, j);
                boolean isValid = checkWord(temp);
                if(isValid) list.add(temp);
            }
        }
        System.out.println("list = " + list);
        return list.size();
    }

    private static boolean checkWord(String temp) {
        String[] split = temp.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));
        Set<String> set = new HashSet<>(list);
        return temp.length() == set.size();
    }

    private static boolean checkWord2(String temp) {
        boolean isValid = true;
        String[] split = temp.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));
        for (String s : list) {
          if(Collections.frequency(list,s) > 1) {
              isValid = false;
              break;
          }
        }
        return isValid;
    }

}
