package homework;

import java.util.function.Predicate;

public class PositiveChecker {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (num) -> num > 0;

        int positiveNum = 5;
        System.out.println(positiveNum + " is positive " + isPositive.test(positiveNum));


        int negativeNum = -2;
        System.out.println(negativeNum + " is positive " + isPositive.test(negativeNum));
    }
}
