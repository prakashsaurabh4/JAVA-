class MyThread extends Thread
{
    public MyThread(String name)
    {   
        super(name);
    }
        public void run()
        {
            int count=1;
            while(true)
            {
                System.out.println(count++ +"My thread");

                
            }
        }
    }


public class MultithreadingTest143
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread("My Thread 1");
        
        t.start();
        
        int count=1;
            while(true)
            {
                System.out.println(count++ +"Main");
                Thread.yield();
            }
       
    }
}