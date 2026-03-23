import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your no:");
        int num= sc.nextInt();

        if (num > 0){
            System.out.println("Your Number is positive");
        } else if (num == 0) {
            System.out.println("Your Number is Zero");
        }else {
            System.out.println("Your Number is Negative");
        }
    }
}
