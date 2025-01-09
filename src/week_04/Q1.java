package week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    /**
     * how to find if it is perfect square
     */

    public static void main(String[] args) {
        int number = 9;
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,9,36,40));
        list.forEach(n -> System.out.println(n + " - " + isPerfectSquare(n)));
        //System.out.println("isPerfectSquare(number) = " + isPerfectSquare(number));
    }

    private static boolean isPerfectSquare(int number) {
        if(number < 1) return false;
        if(number == 1) return true;
        for (int i = 1; i < number/2; i++) {
            if(number/(i*i) == 1) return true;
            //if(number == (i*i)) return true;
        }
        return false;
    }

}
