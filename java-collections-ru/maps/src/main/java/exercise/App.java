package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static void main(String[] args) {
        Map<String, Integer> expected1 = new HashMap<>();
        expected1.put("word", 3);
        expected1.put("apple", 2);
        expected1.put("text", 1);
        expected1.put("dog", 1);

        System.out.println(getWordCount("word text dog apple word apple word"));
    }

    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isBlank()) {
            return new HashMap<>();
        }
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> words = Arrays.asList(sentence.split("[,;! ]+"));
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static String toString(Map<String, ? extends Number> wordMap) {
        if (wordMap.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{\n");
        wordMap.forEach((k, v) -> sb.append("  ").append(k).append(": ").append(v).append("\n"));
        sb.append("}");
        return sb.toString();

    }

}
//END
