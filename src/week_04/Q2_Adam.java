package week_04;

import java.util.Arrays;

public class Q2_Adam {

    public static void main(String[] args) {

        int[] array = {4,3,5,4,3};

        int output = countSubArrayDecreasing(array);
        System.out.println("output = " + output);

    }

    private static int countSubArrayDecreasing(int[] array) {

        int counter = 0;

        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j <= array.length-i; j++) {
                int[] subArray = Arrays.copyOfRange(array, j, j + i);
                boolean res = isValidSub(subArray);
                if(res) counter++;
            }
        }

        return counter;

    }

    private static boolean isValidSub(int[] subArray) {
        boolean isValid = true;
        for (int i = 0; i < subArray.length-1; i++) {
            int current = subArray[i];
            int next = subArray[i+1];
            if(next > current) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

}
