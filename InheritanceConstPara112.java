class Parent
{
    Parent()
    {
        System.out.println("Non-Parameter of Parent");
    }
    Parent(int x)
    {
        System.out.println("Parameter of Parent "+x);
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
    Child(int x,int y)
    {
        super(x);
        System.out.println("2Parameter of Child "+y);
    }
}

public class InheritanceConstPara112 
{
    public static void main(String args[])
    {
        // Child c=new Child();
        Child d=new Child(10,20);
    }
}