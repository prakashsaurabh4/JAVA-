class Circle 
{
    public double radius;

    public double area() 
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;

    public double volume()
    {
        return area() * height;
    }
}

public class InheritanceCC108
{
    public static void main(String args[])
    {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;

        System.out.printf("Volume : %.2f\n",c.volume());
        System.out.printf("Area : %.2f\n",c.area());
        System.out.printf("Perimeter : %.2f\n",c.perimeter());
        System.out.printf("Circumference : %.2f\n",c.circumference());
    }
}