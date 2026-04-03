class A
{
    public void display()
    {
       System.out.println("Hello"); 
    }
}

class B extends A
{
    @Override
    public void display()
    {
    //    super.display(); 
    }
    @Deprecated
    public void show()
    {
    //  System.out.println("Deprecated method");   
    }
    
}

public class AnnotationDemo157 
{
    
    public static void main(String[] args) 
    {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}