import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter value of A: ");
        int a = input.nextInt();
        System.out.print(" Enter value of B: ");
        int b = input.nextInt();

        int c=a;
        a=b;
        b=c;

        System.out.println("Value of a is : "+a);
        System.out.print("Value of b is : "+b);

    }
}
