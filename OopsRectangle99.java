class OopsRectangle99 
{
    public int length;
    public int breadth;

    public int area()
    {
        return length * breadth;
    }

    public int perimeter()
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

        OopsRectangle99 r1=new OopsRectangle99();
        r1.length=10;
        r1.breadth=20;

        System.out.println("Area "+r1.area());
        System.out.println("Perimeter "+r1.perimeter());
        System.out.println("Is it a Square "+r1.isSquare());
    }
}