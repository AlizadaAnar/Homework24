package classwork.sample4stream;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Calculate the sum of squares of even numbers
        int sumSquares = numbers.stream()
                .filter(value -> value % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("Sum of squares: " + sumSquares);

    }
}
