import java.lang.*;
import java.util.Scanner;
public class LoopChallenge40 {
    public static void main(String args[]) {
        int n;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
