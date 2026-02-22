class Students implements Comparable<Students>
{
    int id;
    String name;
    double marks;

    Students(int id, String name,double marks){
        if (marks< 0|| marks>100){
            throw new IllegalArgumentException("MArks must between 1 &100");
        }
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Students s) {
        return Double.compare(s.marks,this.marks);
    }
}
