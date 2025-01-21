package week_07;

public class Recursive_01 {

    public static void main(String[] args) {

        System.out.println("sumNumber(5) = " + sumNumber(5));
        System.out.println("sumNumberRecursive(5) = " + sumNumberRecursive(5));

        System.out.println("fac(5) = " + fac(5));
        System.out.println("facRecursive(5) = " + facRecursive(5));

    }

    //create a method that sum the numbers until the given number
    private static int sumNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    //implement same with recursive method
    private static int sumNumberRecursive(int number) {
        if(number == 1) {
            return 1;
        }else {
            return number + sumNumberRecursive(number-1);
        }
    }

    //create a method that returns factoriel of given number
    private static int fac(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }

    //implement same with recursive method
    private static int facRecursive(int number) {
        if(number == 1) {
            return 1;
        }else {
            return number * facRecursive(number-1);
        }
    }

}
