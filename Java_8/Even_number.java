import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Java 8 Stream to filter even numbers and print
        Arrays.stream(numbers)
              .filter(n -> n % 2 == 0)   // Lambda expression to check even numbers
              .forEach(n -> System.out.print(n + " "));
    }
}
