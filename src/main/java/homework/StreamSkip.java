package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamSkip {
    public static void main(String[] args) {
        // Create a stream of integers
        IntStream intStream = IntStream.rangeClosed(1, 10);

        // Use the skip() operation to skip the first two elements
        IntStream remainingElements = intStream.skip(2);

        // Print the remaining elements
        System.out.println("Original Stream: " + Arrays.toString(IntStream.rangeClosed(1, 10).toArray()));
        System.out.println("Remaining Elements (after skipping the first two): " + Arrays.toString(remainingElements.toArray()));
    }
}
