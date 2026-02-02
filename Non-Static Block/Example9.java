class Example9 {
    int a;

    { 
        System.out.println("Inside NSB Block: " + a);
        a = 10;
        System.out.println("Inside NSB Block (updated): " + a);
    }

    Example9() {
        System.out.println("Inside 0 Arg: " + a);
        a = 100;
        System.out.println("Inside 0 Arg Const: " + a);
    }

    Example9(char x) {
        System.out.println("Inside 1 Arg: " + a);
        a = 1000;
        System.out.println("Inside 1 Arg Const: " + a);
    }

    public static void main(String[] args) {
        System.out.println("Start @ cyber sucess");
        Example9 ref1 = new Example9();
        System.out.println("---");
        Example9 ref2 = new Example9('a');
		System.out.println("Start @ cyber sucess");
    }
}