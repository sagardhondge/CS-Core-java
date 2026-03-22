import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hii "+ name +" Enter your fullname: ");
        String fullname = sc.nextLine();
        System.out.println(name +" "+ fullname);
    }
}
