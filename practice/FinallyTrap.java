public class FinallyTrap {
    static int test(){
        try{
            return 10;
        }finally {
            return 20; // it will overide the first return
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
