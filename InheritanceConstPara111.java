class Parent
{
    Parent()
    {
        System.out.println("Non-Parameter of Parent");
    }
    Parent(int x)
    {
        System.out.println("Parameter of Parent");
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Parameter of Child");
    }
    Child(int y)
    {
        System.out.println("Parameter of Child");
    }
}

public class InheritanceConstPara111 
{
    public static void main(String args[])
    {
        // Child c=new Child();
        // Child d=new Child(20);
        Parent d=new Parent(10);
    }
}