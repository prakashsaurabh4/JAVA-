class OopsSquare102 {

    public int side;

    public int area()
    {
        return side * side;
    }

    public int perimeter()
    {
        return 4*side;
    }

    public static void main(String args[]) 
    {
        OopsSquare102 s=new OopsSquare102();

        s.side=8;
        System.out.println("Area of Square "+s.area());
        System.out.println("Perimeter od Square "+s.perimeter());
    }
}