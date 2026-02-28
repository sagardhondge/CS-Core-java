class Parent {

    Parent() {
        System.out.println("Parent Constructor Start");

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Parent Catch Block");
        } finally {
            System.out.println("Parent Finally Block");
        }

        System.out.println("Parent Constructor End");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child Constructor");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Main Ends");
    }
}