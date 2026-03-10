public class MethodsChallenge84 {
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(i%2==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(isPrime(19));
    }
}