public class ExceptionFinallyDemo136 
{
    static void meth1()throws Exception
    {
        try
        {
           System.out.println(10/2); 
        throw new Exception();
        }
        finally
        {
           //this message willdefinitly execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        meth1();
    }   
}