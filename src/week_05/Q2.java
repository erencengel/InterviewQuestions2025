package week_05;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        /**
         * find the minimum number in an array
         */

        int[] array = {1,3,10,-100, 50, 5000};

        System.out.println("getMin(array) = " + getMin(array));
        System.out.println("getMin1(array) = " + getMin1(array));
        System.out.println("getMin2(array) = " + getMin2(array));

    }

    private static int getMin(int[] array) {
        int minimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < minimum) minimum = array[i];
        }

        return minimum;
    }

    private static int getMin1(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    private static int getMin2(int[] array) {
        int min = array[0];

        for (int i : array) {
            if(i < min) min = i;
        }

        return min;
    }

}
