import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        float year = sc.nextFloat();
        if (year % 400 == 0 || (year %4 ==0 && year % 100 !=0 )){
            System.out.println("Year is an leap year");
        } else {
            System.out.println("Year is not an leap year");
        }
    }
}
