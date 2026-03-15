class Super
{
    private void display() //or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class Sub extends Super    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class InheritanceOverrideRules119 {

    public static void main(String[] args) {
        
        Super s=new Super();
        s.display();
    }
    
}
