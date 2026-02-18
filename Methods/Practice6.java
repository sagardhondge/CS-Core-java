class Demo
{
    int a = 100;         
    static float res2;   

    static void m2()
    {
        Demoo d1 = new Demoo();
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
        Demoo d2 = new Demoo();
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
        Demoo.m2();

        float finalResult = Sample.res1 + Demoo.res2;

        System.out.println(finalResult);

        System.out.println("Stop @ Cyber Success");
    }
}
