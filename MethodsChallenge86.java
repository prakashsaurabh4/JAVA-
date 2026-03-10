public class MethodsChallenge86 {

    static int max(int A[])
    { 
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
        if(A[i]>max)
        max=A[i];
    }
    return max;
    }
     public static void main(String args[])
     {
        int A[]={3,6,8,9,3};
        System.out.println(max(A));
     }
}