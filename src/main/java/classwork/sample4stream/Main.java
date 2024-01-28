package classwork.sample4stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Orange", "Apple", "Mango");
        List<String> result = fruits.stream()
                .filter(allFruit -> allFruit.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
