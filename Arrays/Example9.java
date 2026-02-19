class swigyy
{   int orderId;
    String orderName;
    swigyy(int orderId, String orderName)
    {   this.orderId=orderId;
        this.orderName=orderName;
    }
}
class Example9 {
    public static void main (String [] args){
        System.out.println("Start @ cyber Sucess");
        swigyy [] swig=new swigyy[3];
        swig[0]=new swigyy(101,"Pav Bhaji");;
        swig[1]=new swigyy(102,"Puri Bhaji");;
        swig[2]=new swigyy(103,"Burger");
        for (swigyy ss : swig){
            System.out.println(ss.orderId+" -"+ss.orderName);
        }
        System.out.println("Stop @ cyber Sucess");
    }
}
