class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    public Child()
    {
       System.out.println("Child Constructor"); 
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
       System.out.println("GrandChild Constructor"); 
    }
}

public class InheritanceConstructors110
{
    public static void main(String args[])
    {
    GrandChild p=new GrandChild();
    //    Child p=new Child();
    // Parent p=new Parent();

    }
}