import java.lang.*;
public class Array1DChallenge72 {
    public static void main(String args[]) {
        
        int A[]={3,9,7,8,12,6,15,5,4,10};

        int B[]=new int[10];

        for(int i=0;i<A.length;i++)
        {   
            System.out.print(A[i]+",");
             B[i]=A[i];
        }
        System.out.println("");
        for(int x:B)
        {
            System.out.print(x+",");
        }
    }
}
