import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int n) {

        if(n == 0) return 1;   // Edge case

        int count = 0;

        while(n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = countDigits(n);

        System.out.println("Number of digits: " + result);

        sc.close();
    }
}