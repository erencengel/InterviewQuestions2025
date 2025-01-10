package week_05;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        /**
         * find the maximum number in an array
         */

        int[] array = {1,3,10,-100, 50, 5000};

        System.out.println("getMax(array) = " + getMax(array));
        System.out.println("getMax1(array) = " + getMax1(array));
        System.out.println("getMax2(array) = " + getMax2(array));

    }

    private static int getMax(int[] array) {
        int maximum = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maximum) maximum = array[i];
        }

        return maximum;
    }

    private static int getMax1(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    private static int getMax2(int[] array) {
        int max = array[0];

        for (int i : array) {
            if(i > max) max = i;
        }

        return max;
    }

}
