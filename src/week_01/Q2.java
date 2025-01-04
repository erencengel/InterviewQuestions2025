package week_01;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    /**
     * count of substrings having all distinct characters
     * solution by Eren Ç.
     * 3.1.2025
     */

    public static void main(String[] args) {
        System.out.println(getIndividuals("gfg"));
    }


    static List<String> getAllSubstrings(String s) {
        int l = s.length();
        List<String> list = new ArrayList<>();

        for(int j = 1; j <= l; j++) {
            for(int i = j; i <= l; i++) {
                list.add(s.substring(j-1,i));
            }
        }

        return list;
    }

    static List<String> getIndividuals(String str) {
        List<String> list = getAllSubstrings(str);
        List<String> distinctCharacters = new ArrayList<>();
        for(String l: list) {
            if(l.length() == 1) {
                distinctCharacters.add(l);
                continue;
            }
            boolean bool = true;
            for(int i = 0; i < l.length(); i++) {
                bool = l.indexOf(l.substring(i,i+1)) == (l.lastIndexOf(l.substring(i,i+1)));
                if(!bool) break;
            }
            if(bool) distinctCharacters.add(l);
        }
        return distinctCharacters;
    }
}
