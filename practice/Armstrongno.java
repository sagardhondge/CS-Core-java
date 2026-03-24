import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = noOfDigits(num);
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= rem;
            }

            sum += power;
            num /= 10;
        }

        return sum == original;
    }

    public static int noOfDigits(int num) {
        if (num == 0) return 1;

        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }
}