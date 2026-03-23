import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your second Number: ");
        int num2 = sc.nextInt();
        int lcm =Lcm (num1,num2);
        System.out.println("Lcm of the two no is: "+ lcm);
    }
    static int Lcm(int num1, int num2){
    int i =1;
    while (true){
    int factor = num1 * i;
    if ( factor % num2 ==0 ){
        return factor;
            }
        i++;
        }
    }
}
