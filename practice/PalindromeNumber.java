import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);   // correct way

        System.out.print("Enter a number: ");
        int number = sc.nextInt();       // Change this value to test
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;     // Extract last digit
            reverse = reverse * 10 + digit;  // Build reversed number
            number = number / 10;        // Remove last digit
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
        sc.close();
    }
}