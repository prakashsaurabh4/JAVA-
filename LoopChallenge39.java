import java.lang.*;
import java.util.Scanner;
public class LoopChallenge39 {
    public static void main(String args[]) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=0;i<=n; i++)
        {
            sum=sum+i;
        }
           System.out.println("The Sum is "+sum); 
    }
}
