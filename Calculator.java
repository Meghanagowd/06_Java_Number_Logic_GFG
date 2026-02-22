import java.util.Scanner;

public class  Calculator {

    public static int calculate(int a, int b, char operator) {

        switch(operator) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if(b != 0)
                    return a / b;
                else {
                    System.out.println("Division by zero not allowed");
                    return 0;
                }

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result = calculate(a, b, operator);

        System.out.println("Result: " + result);

        sc.close();
    }
}