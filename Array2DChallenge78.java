import java.lang.*;
public class Array2DChallenge78 {
    public static void main(String args[]) {

        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{2,2,3},{4,1,6},{7,4,6}};
        int C[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                    for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.format("%03d ",y);
            }
            System.out.println("");
        }
    }
}
