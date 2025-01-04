package week_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {


    /**
     * I am from Giresun
     * n us eriG morfmaI
     */

    public static void main(String[] args) {
        String name = "I am from California";
        List<String> list = new ArrayList<>(Arrays.asList(name.split("")));
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(" ")) index.add(i);
        }
        String nameV2 = new StringBuffer(name.replaceAll(" ", "")).reverse().toString();
        List<String> result = new ArrayList<>(Arrays.asList(nameV2.split("")));
        index.forEach(n -> result.add(n, " "));
        String finalResult = "";
        for (String s : result) {
            finalResult += s;
        }
        System.out.println("finalResult = " + finalResult);
    }
}
