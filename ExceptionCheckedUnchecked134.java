class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance should not be less than 5000";
    }
}

public class ExceptionCheckedUnchecked134
{
    static void checkBalance(int balance)
    {
        try
        {
            if(balance < 5000)
            {
                throw new LowBalanceException();
            }
            else
            {
                System.out.println("Balance is: " + balance);
            }
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }

    static void fun1(int balance)
    {
        checkBalance(balance);
    }
    
    static void fun2(int balance)
    {
        fun1(balance);
    }
    
    static void fun3(int balance)
    {
        fun2(balance);
    }
    
    public static void main(String[] args) 
    {
       int balance = 4000;   // assign balance
       fun3(balance);        // pass balance
    }   
}