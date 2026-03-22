import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int Num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int Num2 = sc.nextInt();

        int sum= Num1 + Num2;
        System.out.println("Addition is :" +sum);

    }
}
