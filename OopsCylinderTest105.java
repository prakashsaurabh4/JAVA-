class  Cylinder
{
    private int radius;
    private int height;
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class OopsCylinderTest105 {

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);
        
        System.out.printf("LidArea %.2f\n",c.lidArea());
        System.out.printf("Circumference %.2f\n",c.perimeter());
        System.out.printf("totalSurfaceArea %.2f\n",c.drumArea());
        System.out.printf("Volume %.2f\n",c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
        
    }
    
}