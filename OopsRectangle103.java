class OopsRectangle103 
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }

    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }

    public double area()
    {
        return length * breadth;
    }

    public double perimeter()
    {
        return 2 * (length + breadth);
    }

    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        OopsRectangle103 r=new OopsRectangle103();
        r.setLength(10.5);
        r.setBreadth(20.2);

        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is it a Square "+r.isSquare());
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
    }
}