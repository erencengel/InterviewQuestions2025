package week_02;

public class Q1 {

    /**
     * check if the given number is prime
     */

    public static void main(String[] args) {
        //System.out.println(isPrime(3700));
        System.out.println("Math.sqrt(36) = " + Math.sqrt(39));
    }

    static boolean isPrime(int number) {
    if(number <= 1) return false;
    if(number == 2) return true;
    for(int i = 2; i < number/2; i++) {
        if(number%i == 0) return false;
    }
    return true;
    }

}
