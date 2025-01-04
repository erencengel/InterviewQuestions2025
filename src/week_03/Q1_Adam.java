package week_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_Adam {

    /**
     * I am from Giresun
     * n us eriG morfmaI
     */

    public static void main(String[] args) {
        String str = "I am from California";
        String output = reverseString(str);
        System.out.println("output = " + output);
    }

    private static String reverseString(String str) {
        String output = "";

        String[] words = str.split(" ");


        //List<Integer> lengths = new ArrayList<>();

        //for (String word : words) {
        //    lengths.add(word.length());
        //}

        List<Integer> lengths = Arrays.stream(words).map(n -> n.length()).collect(Collectors.toList());

        System.out.println("lengths = " + lengths);

        String nonSpace = str.replaceAll(" ", "");

        System.out.println("nonSpace = " + nonSpace);

        String reversed = new StringBuilder(nonSpace).reverse().toString();

        System.out.println("reversed = " + reversed);

        int start = 0;
        for (Integer length : lengths) {
            String substring = reversed.substring(start, start + length);
            start = start + length;
            output += substring + " ";
        }

        return output.trim();

    }

}
