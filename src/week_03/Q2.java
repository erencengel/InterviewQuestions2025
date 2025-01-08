package week_03;

import java.util.*;

public class Q2 {
    /**
     * word break problem
     * let's divide words
     * {i, like, sam, sung}
     * ilike --> i like
     * ilikesamsung --> like samsung
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("i");
        list.add("like");
        list.add("sam");
        list.add("sung");
        list.add("samsung");
        list.add("mobile");
        list.add("ice");
        list.add("cream");
        list.add("icecream");
        list.add("man");
        list.add("go");
        list.add("mango");
        String input = "ilikesamsungmobilee";
        System.out.println("isBreakable(list, input) = " + isBreakable(list, input));

    }

    private static boolean isBreakable(List<String> list, String input) {
        String s1 = null;
        for (String s : list) {
            if(input.contains(s)) {
                s1 = input.replaceFirst(s,"");
                input = input.replaceFirst(s,"");
            }
        }
        return s1.equals("");
    }
}
