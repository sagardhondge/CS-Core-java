public class Client {
    public static void main(String[] args) throws Exception {

        job1 job = new job1();

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        Thread t3 = new Thread(job);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        t1.join();
        t2.join();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
    }
}
