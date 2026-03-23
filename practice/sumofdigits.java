import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits is: " + sum);
    }
    static int sumOfDigits(int num){
        int sum=0;
        while (num>0){
            sum += num % 10;
            num /=10;
        }
        return sum;
    }
}
