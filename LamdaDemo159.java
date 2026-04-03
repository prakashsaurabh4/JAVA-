@FunctionalInterface
interface MyLambda
{
    public void display();
}

public class LamdaDemo159 {

    public static void main(String[] args) {
        
        MyLambda m=()->{System.out.println("Hello world");};
        
        m.display();
        
    }
    
}
