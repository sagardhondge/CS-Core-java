import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime ){
            System.out.println("Your num is prime");
        }else {
            System.out.println("Your num is not prime");
        }
    }
    static  boolean isPrime(int num){
        int i = 2;
        while (i< num){
            if (num % i==0){
                return false;
            }
            i++;
        }
        return  true;
    }
}
