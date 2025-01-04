package week_01;

public class Q1 {

    /**
     * reverse string
     */

    public static void main(String[] args) {

        System.out.println("reverseString(\"aslıhan\") = " + reverseString("aslıhan"));
        System.out.println("reverseStringLoop(\"aslıhan\") = " + reverseStringLoop("aslıhan"));

    }

    static String  reverseString(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    static String reverseStringLoop(String str) {
        String test = "";
        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            test += str.charAt(i);
        }
        return test;
    }

}
