import java.lang.*;
import java.util.Scanner;
public class LoopChallenge47 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("AP of first n term");
        System.out.println("Enter the a, d and n");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        int term=a;
        for(int i=0; i<n; i++)
        {
            System.out.print(term+" , ");
            term=term+d;
        }


    }
}
