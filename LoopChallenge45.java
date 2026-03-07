import java.lang.*;
import java.util.Scanner;
public class LoopChallenge45 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        int r;
        int rev=0;

        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(rev==m)
            System.out.println("Its a Palindrome");
        else
            System.out.println("Its not a Palindrome");

    }
}