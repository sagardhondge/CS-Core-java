import java.util.Scanner;

public class mutiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        printTable(num);
    }
    public  static void printTable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num+" X "+ i +" =" + (num*i));
            i++;
        }
        System.out.println("using for loop");
        for (int j = 1; j <=10 ; j++) {
            System.out.println(num * j);
        }
    }
}
