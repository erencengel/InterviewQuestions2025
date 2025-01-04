package week_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_Adam {

    public static void main(String[] args) {
        int arr[] = {-1,5,13,8,2,3,3,1}, k = 4;

        List<Double> medians =  separateWindowWithSize(arr, k);
        System.out.println("medians = " + medians);

    }

    private static List<Double> separateWindowWithSize(int[] arr, int k) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i <= arr.length-k; i++) {
            int[] subArr = Arrays.copyOfRange(arr, i, i+k);
            Arrays.sort(subArr);
            if(k%2 != 0) {
                result.add((double)subArr[k/2]);
            }else {
                result.add((double)(subArr[k/2] + subArr[k/2-1])/2);
            }
        }
        return result;
    }

}
