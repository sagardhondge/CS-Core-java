class Practice2
{
    static int a = 100;      
    float b = 200.5f;        

    int m1(int var1)
    {
        System.out.println("Inside m1 method");
        int result1 = a + var1;
        return result1;
    }

    static float m2(float var2)
    {
        System.out.println("Inside m2 method");

        Practice2 ref2 = new Practice2();   
        float result2 = ref2.b + var2;      

        return result2;
    }

    public static void main(String[] args)
    {
        System.out.println("Start @ cyber success");

        int var1 = 10;
        float var2 = 20.5f;

        Practice2 ref1 = new Practice2();
        int result1 = ref1.m1(var1);

        float result2 = m2(var2);

        float finalResult = result1 + result2;
        System.out.println("Final Result is " + finalResult);

        System.out.println("Stop @ cyber success");
    }
}
