package week_06;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        /**
         * given an array, print first 5 largest numbers
         */

        int[] array = {2, -8, 10, 1000,0,5, 10000};
        printFirstFive(array);

    }

    private static void printFirstFive(int[] array) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Arrays.sort(array);
        for (int i : array) {
            list.add(i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            list2.add(array[i]);
        }

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList().stream().limit(5).toList());
        System.out.println(list2.stream().limit(5).toList());

    }



}
