import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your nUmber: ");
        long num = sc.nextInt();
        long fact = factorialNum( num);
        System.out.print("Factorial is: "+ fact);
    }
    public static long factorialNum(long num){
        if (num<2){
            return 1;
        }
        long fact =1;
        int i =2;
        while (i<= num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
