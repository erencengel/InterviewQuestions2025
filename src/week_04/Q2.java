package week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {

    /**
     * There is a given array
     * Divide it sub-arrays
     * Return the consecutively decreasing ones
     */

    public static void main(String[] args) {
    
        Integer[] array = {4,3,5,4,3};
        //array = new Integer[]{1, 2, 5, 3};
        System.out.println("getSumOfDecreasingPeriods(array) = " + getSumOfDecreasingPeriods(array));
    }

    private static int getSumOfDecreasingPeriods(Integer[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                Integer[] ints = Arrays.copyOfRange(array, i, j);
                System.out.println(Arrays.toString(ints));
                Integer[] integers = Arrays.copyOf(ints, ints.length);
                Arrays.sort(ints, Collections.reverseOrder());
                if(Arrays.equals(integers,ints)) sum++;
            }
        }
        return sum;
    }

}
