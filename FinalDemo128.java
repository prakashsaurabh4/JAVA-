class Test {
    public final void show()
    {
        System.out.println("Hello");
    }
}

class Test1 extends Test
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalDemo128 {

    /*final float PI;
    
    public FinalDemo()
    {
        PI=3.1425f;
    }*/
    
    public static void main(String[] args) {
        Test t = new Test();   // create object of Test class
        t.show();  

        final float PI;
        PI=3.1425f;
        System.out.println(PI);
        
    }
    
}