public class ClinetY {
    public static void main(String[] args) {
        JobY jobY = new JobY();

        Thread t1 = new Thread(jobY);
        Thread t2 = new Thread(jobY);
        Thread t3 = new Thread(jobY);
        t1.start();
        t2.start();
        t3.start();
    }
}
