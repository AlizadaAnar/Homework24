package homework;

import java.util.Arrays;
import java.util.List;

public class StreamLengthPrinter {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "pear");

        // Use a stream to filter out strings with length less than 5
        List<String> filteredList = stringList.stream()
                .filter(s -> s.length() >= 5)
                .toList();  // Requires Java 16 or later, use .collect(Collectors.toList()) for earlier versions

        // Print the filtered list
        System.out.println("Original List: " + stringList);
        System.out.println("Filtered List (length >= 5): " + filteredList);
    }
}
