import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
