//Student Info 
//Rules
//Use a constructor to initialize values
//Print the name in UPPERCASE
//If age = 0, print "Invalid age"
//Otherwise, print student details
class Demo {
    String name;
    int age;

    Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        if (age <= 0) {
            System.out.println("Invalid Info");
        } else {
            System.out.println("Name: " + name.toUpperCase());
            System.out.println("Age: " + age);
        }
    }
}

class Student {
    public static void main(String[] args) {
        Demo d = new Demo("Sagar", 20);
        d.display();
    }
}
