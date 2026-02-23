public class ClassLoadingExample {
    static {
        System.out.println("Inside static block");
    }
    {
        System.out.println("Inside nonstatic block ");
    }
    ClassLoadingExample()
    {
        System.out.println("Inside constructor");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("Inside main method");
        ClassLoadingExample ref1 = new ClassLoadingExample();
        ClassLoadingExample ref2 = new ClassLoadingExample();

    }
    static void m1()
    {
        System.out.println("Inside static method");
    }
}
