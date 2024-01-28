package homework;

import java.util.Arrays;
import java.util.List;

public class StreamLambdaProductFinder {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbersList = Arrays.asList(2, 3, 5, 7, 11);

        // Use a stream to find the product of all numbers
        long product = numbersList.stream()
                .mapToLong(Integer::longValue) // Convert each integer to long to avoid overflow
                .reduce(1, (a, b) -> a * b);

        // Print the product
        System.out.println("List of Numbers: " + numbersList);
        System.out.println("Product of Numbers: " + product);
    }
}
