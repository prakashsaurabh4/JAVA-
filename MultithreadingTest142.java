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
                System.out.println(count++);

                
            }
        }
    }


public class MultithreadingTest142
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread("My Thread 1");
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        mainThread.join(); //daemon thread continue
       
    }
}