class OopsCylinder100 {

    public double radius;
    public double height;

    public double lidarea()
    {
        return Math.PI* radius * radius;
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }

    public double totalSurfaceArea()
    {
        return 2*lidarea() + circumference()*height;
    }

    public double volume()
    {
        return Math.PI* radius * radius * height;
    }

    public static void main(String area[])
    {
        OopsCylinder100 c=new OopsCylinder100();

        c.radius=6;
        c.height=4;

    System.out.printf("Lateral Area %.2f\n", c.lidarea());
    System.out.printf("Circumference %.2f\n", c.circumference());
    System.out.printf("Total Surface Area %.2f\n", c.totalSurfaceArea());
    System.out.printf("Volume %.2f\n", c.volume());
    }
}