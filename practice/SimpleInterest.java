public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 100;
        double time = 2.4;
        double rate = 3;

        double si = (principal * time * rate) / 100;

        System.out.println("The simple interest is: " + si);
    }
}