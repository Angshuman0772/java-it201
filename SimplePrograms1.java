import java.util.*;

// Program to implement Hello World.
public class SimplePrograms1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        name();
        variables();
        input(sc);
        calculator(sc);
        even(sc);
        largest(sc);
        sc.close();
    }

    // display name, roll no., college.
    public static void name() {
        System.out.println("Angshuman Pal");
        System.out.println("A017");
        System.out.println("Amity Kolkata");
    }

    public static void variables() {
        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        String course = "Java";
        System.out.println(age + " " + marks + " " + grade + " " + course);
    }

    public static void input(Scanner sc) {
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName);
    }

    // Calculator
    public static void calculator(Scanner sc) {
        System.out.print("Enter first no.: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next();
        System.out.print("Enter second no.: ");
        double num2 = sc.nextDouble();
        double result;

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Invalid operation");
                return;
            }
        }
        System.out.println("Result = " + result);
    }

    // even or odd
    public static void even(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // largest number
    public static void largest(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " " + "is the largest");
        } else {
            System.out.println(b + " " + "is the largest");
        }
    }
}