class Example15 {
    public static void main (String [] args) {
        System.out.println("Start @ cs");
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        Example15 ref= new Example15();
        String [] s = ref.m1(a);
        System.out.println("Back to main Method");
        for (String ss: s)
        {   System.out.println(ss);
        }
        System.out.println("Stop @ cs");
    }
    String[]  m1(int [] a)
    {   System.out.println("Inside m1 method");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        String [] s ={"Cyber", "Sucess","Training"};
        return s;
    }
}
