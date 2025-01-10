package week_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {

    /**
     * Erase chars when they occur less than N times
     * only letters shall be removed
     * non-letter characters shall not be removed
     * only exception is, if there is consecutive spaces, it shall be replaced with one space
     * text: "aaaffccceee ffc!aaf  1 12dda 123"
     * input: 5
     * we shall remove all characters that occur 1,2,3 or 4 times
     * result: aaaff ff!aaf 1 12a 123
     */

    public static void main(String[] args) {

        String text = "aaaffccceee ffc!aaf  1 12dda 123";
        int number = 4;

        System.out.println(eraseChars(text, number));
    }

    private static String eraseChars(String text, int number) {
        String[] split = text.split("");
        for (String s : split) {
            if (Collections.frequency(List.of(split),s) < number && Character.isLetter(s.charAt(0))) text = text.replaceAll(s, "");
        }
        return eraseExtraSpaces(text);
    }

    private static String eraseExtraSpaces(String text) {
        String result = "";
        String[] split = text.split("");
        List<String> split1 = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            split1.add(split[i]);
        }
        for (int i = 0; i < split1.size(); i++) {
            if(split1.get(i).equals(" ") && split1.get(i+1).equals(" ")) {
                split1.remove(i);
                i--;
            }
        }
        for (String s : split1) {
            result += s;
        }
        return result;
    }

}
