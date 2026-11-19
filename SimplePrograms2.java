import java.util.*;

public class SimplePrograms2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leap_year(sc);
        sum(sc);
        factorial(sc);
        prime(sc);
        sc.close();
    }

    public static void leap_year(Scanner sc) {
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // if (year % 400 == 0) {
        // System.out.println("Leap Year");
        // } else if (year % 100 == 0) {
        // System.out.println("Not a leap year");
        // } else if (year % 4 == 0) {
        // System.out.println("Leap year");
        // } else {
        // System.out.println("Not a leap year");
        // }
    }

    // sum of n natural numbers
    public static void sum(Scanner sc) {
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    // Find factorial
    public static void factorial(Scanner sc) {
        System.out.println("Enter the number");
        int n = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }

    // Check whether the number is prime or not
    public static void prime(Scanner sc) {
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int divisor_count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor_count++;
            }
        }
        if (divisor_count == 2) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }
}
