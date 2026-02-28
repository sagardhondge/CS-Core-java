public class Studentss {
    static int count = 0;   // shared counter
    String name;

    Studentss(String name) {
        this.name = name;
        count++;            // increment when object is created
        System.out.println("Student Created: " + this.name);
    }

    public static void main(String[] args) {

        Studentss s1 = new Studentss("Sagar");
        Studentss s2 = new Studentss("Rahul");
        Studentss s3 = new Studentss("Amit");

        System.out.println("Total Students Created: " + Studentss.count);
    }
}
