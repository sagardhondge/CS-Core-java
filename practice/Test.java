class A {

    static int x = 10;

    static {
        System.out.println("A Static Block");
        x = x + 5;
    }

    A() {
        System.out.println("A Constructor: x = " + x);
        x = x + 10;
    }
}

class B extends A {

    static {
        System.out.println("B Static Block");
    }

    B() {
        System.out.println("B Constructor: x = " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println("After first object: x = " + A.x);
        B obj2 = new B();
        System.out.println("After second object: x = " + A.x);
    }
}