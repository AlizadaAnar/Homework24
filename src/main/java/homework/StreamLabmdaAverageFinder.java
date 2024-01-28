package homework;

import java.util.Arrays;
import java.util.List;

public class StreamLabmdaAverageFinder {
    public static void main(String[] args) {
        // Create a list of words
        List<String> wordsList = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "pear");

        // Use a stream to find the average length of strings
        double averageLength = wordsList.stream()
                .mapToInt(String::length)  // Convert each string to its length as an int
                .average()
                .orElse(0.0);  // If the stream is empty, return 0.0

        // Print the average length
        System.out.println("List of Words: " + wordsList);
        System.out.println("Average Length of Strings: " + averageLength);
    }
}
