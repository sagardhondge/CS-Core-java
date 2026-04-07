
public class Clientx {
    public static void main(String[] args) {
        JobX job1 = new JobX();

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job1);
        Thread t3 = new Thread(job1);
        t1.start();
        t2.start();
        t3.start();
    }
}
