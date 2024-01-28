package homework;

import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

public class DoubleRounding {
    public static void main(String[] args) {
        // Create an array of doubles
        double[] doublesArray = { 3.14, 2.718, 1.5, 6.75, 9.99 };

        // Lambda expression to round each double to the nearest integer
        double[] roundedArray = roundDoubles(doublesArray, Math::round);

        // Print the rounded values
        System.out.println("Original Doubles: " + Arrays.toString(doublesArray));
        System.out.println("Rounded Integers: " + Arrays.toString(roundedArray));
    }

    // Method to apply the lambda expression to each element of the array
    private static double[] roundDoubles(double[] array, DoubleUnaryOperator roundFunction) {
        return Arrays.stream(array)
                .map(roundFunction)
                .toArray();
    }
}
