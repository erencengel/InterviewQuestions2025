package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {

    /**
     * find the median in the given window(3 or 4)
     */

    private static List<Double> result = new ArrayList<>();

    public static void main(String[] args) {
        int medianWindow = 4;
        int[] array = {-1,5,13,8,2,3,3,1};
        System.out.println(getMedian(medianWindow, array));
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static void findMedian(List<Integer> list, int number) {
        Collections.sort(list);
        if(isEven(number)) {
            result.add(Double.valueOf(Double.valueOf((list.get(list.size()/2)) + Double.valueOf(list.get((list.size()/2)-1)))/2));
        } else {
            result.add(Double.valueOf(list.get(list.size()/2)));
        }
    }

    private static List<Double> getMedian(int k, int[] array) {
        int i = 0;
        int windowNumber = k;
        while(k <= array.length) {
            List<Integer> list = new ArrayList<>();
            for(int a = i; a < k; a++) {
                list.add(array[a]);
            }
            findMedian(list,windowNumber);
            k++;
            i++;
        }
        return result;
    }
}
