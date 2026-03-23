import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of F :");
        double Fh= sc.nextDouble();
        double cls = (Fh -32)* 5/9;
        System.out.println("The temp is:"+ cls);
    }
}
