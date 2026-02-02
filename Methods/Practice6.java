class Demo
{
    int a = 100;         
    static float res2;   

    static void m2()
    {
        Demo d1 = new Demo();      
        res2 = d1.a + Sample.b;    
        System.out.println("Inside m1 Method");
		return;
    }

}

class Sample
{
    static float b = 200.5f;
    static float res1;

    void m1()
    {
        Demo d2 = new Demo();      
        res1 = d2.a + b;           
        System.out.println("Inside m1 Method");
		return;
    }
}

class Practice6
{
    public static void main(String[] args)
    {
        System.out.println("Start @ Cyber Success");

        //call m1
        Sample s1 = new Sample();
        s1.m1();

        //call m2
        Demo.m2();

        float finalResult = Sample.res1 + Demo.res2;

        System.out.println(finalResult);

        System.out.println("Stop @ Cyber Success");
    }
}
