import java.util.Scanner;

public class SumOfDigits {

    public static int findSum(int n) {

        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = findSum(n);

        System.out.println("Sum of digits: " + result);

        sc.close();
    }
}