import java.lang.*;
public class Array2DChallenge77 {
    public static void main(String args[]) {

        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{2,2,3},{4,1,6},{7,4,6}};
        int C[][]=new int[3][3];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.format("%02d ",y);
            }
         System.out.println("");
        }
    }
}
