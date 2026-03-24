import java.util.Scanner;

public class palaindromeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("It is a Palindrome number");
        } else {
            System.out.println("It is not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        return original == reverse;
    }
}