class Swigyy
{   int orderId;
    String orderName;
    Swigyy(int orderId,String orderName)
    {   this.orderId=orderId;
        this.orderName=orderName;
    }
}
class Example8 {
    public static void main (String [] args){
        System.out.println("Start @ cyber Sucess");
        Swigyy s1=new Swigyy(101,"Pav Bhaji");
        Swigyy s2=new Swigyy(102,"Puri Bhaji");
        Swigyy s3=new Swigyy(103,"Burger");
        Swigyy [] swig=new Swigyy[3];
        swig[0]=s1;
        swig[1]=s2;
        swig[2]=s3;
        for (Swigyy ss : swig){
            System.out.println(ss.orderId+" -"+ss.orderName);
        }
        System.out.println("Stop @ cyber Sucess");
    }
}
