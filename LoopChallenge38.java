import java.lang.*;
import java.util.Scanner;
public class LoopChallenge38 {
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
