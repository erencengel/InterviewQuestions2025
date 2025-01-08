package week_03;

import java.util.List;

public class Q2_Adam {

    /*
    This solution needs to be fixed
     */

    static List<String> dictionary = List.of("i", "la", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango");

    public static void main(String[] args) {
        String input = "ice";
        System.out.println(breakInput(input));
    }

    private static boolean breakInput(String input) {
        String result = "";
        String container = "";

        int start = 0;

        for (int i = 1; i <= input.length(); i++) {
            container = input.substring(start, i);
            if(dictionary.contains(container)){
                result += container;
                start += container.length();
            }
        }
        System.out.println("result = " + result);
        return input.equals(result);
    }

}
