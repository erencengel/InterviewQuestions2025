package week_06;

import java.util.Arrays;

public class Q2 {

    //veil system company
    //int[] array = {1,2,3,4,5,6,7} && number = 2 --> {3,4,5,6,7,1,2}
    //int[] array = {1,2,3,4,5,6,7} && number = 8 --> {2,3,4,5,6,7,1}
    //int[] array = {1,2,3,4,5,6,7} && number < 0 --> throw an error to handle issue gracefully


    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7};
        int number = 10;

        //System.out.println(Arrays.toString(rotateArray(array, number)));
        System.out.println(Arrays.toString(rotateArray2(array, number)));

    }

    private static int[] rotateArray(int[] array, int number) throws Exception {

        if(number < 0) throw new RuntimeException("number should be defined above 0");

        if(number == 0) return array;

        int num = number%array.length;

        int[] rotatedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if(i + num >= array.length) {
                rotatedArray[i] = array[(i+num)%array.length];
                continue;
            }

            rotatedArray[i] = array[i+num];

        }

        return rotatedArray;

    }

    private static int[] rotateArray2(int[] array, int i) {

        if(i < 0) {
            throw new RuntimeException("please give a valid number");
        }

        i = i % array.length;

        int[] firstPart = Arrays.copyOfRange(array, 0, i);
        int[] secondPart = Arrays.copyOfRange(array, i, array.length);

        int result = 0;

        int[] rotatedArray = new int[array.length];

        for (int i1 : secondPart) {
            rotatedArray[result++] = i1;
        }

        for (int i2 : firstPart) {
            rotatedArray[result++] = i2;
        }

        return rotatedArray;

    }

}
