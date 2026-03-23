import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        System.out.print("Here is your Fibonacci Series");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.println("0 ");
        if (num ==0 ) return;

        int first = 0, second =1;
        while (first + second<= num){
            int third = first+ second;
            System.out.print(third + " ");
            first= second;
            second=third;
        }
    }
}
