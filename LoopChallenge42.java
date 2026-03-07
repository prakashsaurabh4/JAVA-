import java.lang.*;
import java.util.Scanner;
public class LoopChallenge42 {
    public static void main(String args[]) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);    
    }
}