public class MethodsChallenge88{

    static double area(double l,double b)
    {
        return l*b;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
     static double area(double a,double b,double h)
    {
        return ((a+b)/2)*h;
    }

    public static void main(String args[]) {
        System.out.println("Area of rectangle "+area(10,14));
        System.out.println("Area of circle "+area(10));
        System.out.println("Area of Trapizium "+area(10,4,6));
    }
}