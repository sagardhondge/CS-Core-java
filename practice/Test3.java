class Animal{
    void sound()
    {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Animal ref = new Dog();
        ref.sound();
    }

}
