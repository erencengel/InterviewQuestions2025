package week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3_Adam {

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

        String s = "aaaffccceee  ffc!aaf        1      12dda 123";
        int occurence = 5;
        String result = removeLetterByOccurence(s, occurence);
        System.out.println(result);

    }

    private static String removeLetterByOccurence(String text, int occurence) {

        String textWithRegularSpaces = removeExtraSpaces(text);

        List<Character> textsAsList = new ArrayList<>();
        for (char c : textWithRegularSpaces.toCharArray()) {
            textsAsList.add(c);
        }

        String result = "";
        for (int i = 0; i < textWithRegularSpaces.length(); i++) {
            char eachChar = textWithRegularSpaces.charAt(i);

            //if it is not a letter --> add this char as it is into String result

            if(!Character.isLetter(eachChar)) {
                result += eachChar;
                continue;
            }

            //erase letter if less than N times
            if(Collections.frequency(textsAsList, eachChar) < occurence) {
                continue;
            }
            result += eachChar;
        }

        return result;
    }

    private static String removeExtraSpaces(String text) {
        String result = "";
        String[] words = text.trim().split(" ");
        for (String word : words) {
            if(!word.isEmpty()) result += word + " ";
        }
        return result.trim();
    }

}
