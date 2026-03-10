public class MethodsChallenge85 {
    
    static int GCD(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String args[])
    {
        int a=15,b=25,c;
        c=GCD(15,25);
        System.out.println(c);
        System.out.println(GCD(23,36));
    }
}