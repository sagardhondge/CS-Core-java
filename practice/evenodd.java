import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no:");
        float num= sc.nextFloat();
        if (num % 2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
