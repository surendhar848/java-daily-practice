import java.util.Scanner;

public class PerfectNumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        // Find all divisors from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors equals the original number
        if (sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is NOT a Perfect Number");
        }

        sc.close();
    }
}
