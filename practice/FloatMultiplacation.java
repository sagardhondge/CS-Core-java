import java.util.Scanner;

public class FloatMultiplacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first decimal number: ");
        double first = sc.nextDouble();
        System.out.println("Please enter the second decimal number: ");
        double second = sc.nextDouble();
        double mul = first*second;
        System.out.println("The multiplacation is: "+ mul);
    }
}
