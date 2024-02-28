package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "woRld"));
    }

    public static boolean scrabble(String letters, String word) {
        char[] letterChars = letters.toLowerCase().toCharArray();
        char[] wordChar = word.toLowerCase().toCharArray();

        List<Character> lettersList = new ArrayList<>();

        for (var c : letterChars) {
            lettersList.add(c);
        }

        for (char c : wordChar) {
            if (!lettersList.contains(c)) {
                return false;
            }
            lettersList.remove(Character.valueOf(c));
        }
        return true;
    }
}
//END
