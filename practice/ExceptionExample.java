import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter first number");
            String input1 = sc.nextLine();
            System.out.println("Enter second number");
            String input2 = sc.nextLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int result= num1/num2;
            System.out.println("Result is " + result);

        }catch (NumberFormatException e){
            System.out.println("Invalid input! Please enter valid integers.");
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide no by zero");
        }
        finally {
            System.out.println("program complted");
        }
        sc.close();
    }
}
