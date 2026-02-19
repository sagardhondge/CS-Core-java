import java.util.Scanner;

public class Scanner8 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1= scan.nextInt();
        System.out.println("Enter the Num2");
        int num2= scan.nextInt();
        int result= num1+num2;
        System.out.println("The result is "+result);
    }
}

