import java.util.*;
import java.util.stream.*;

public class SumEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Sum of all even numbers using Java 8 Streams
        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)   // Keep only even numbers
                         .mapToInt(Integer::intValue) // Convert Integer to int
                         .sum();                    // Sum them up

        System.out.println("Sum of even numbers: " + sum);
    }
}
