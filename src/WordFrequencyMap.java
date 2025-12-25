package src;
import java.util.*;

public class WordFrequencyMap {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";
        String[] words = text.split(" ");
        TreeMap<String, Integer> freqMap = new TreeMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + freqMap);
    }
}