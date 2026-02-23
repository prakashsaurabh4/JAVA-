import java.util.Scanner;
public class RelationalChallenge24 {
    public static void main(String args[]) {
        int m1,m2,m3;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        avg=(m1+m2+m3)/3;

        if(avg>=70)
        {
            System.out.println("Grade A");
        }
        else if(60<=avg && avg<=70)
        {
            System.out.println("Grade B");
        }
        else if(50<=avg && avg<=60)
        {
            System.out.println("Grade C");
        }
        else if(40<=avg && avg<=50)
        {
            System.out.println("Grade D");
        }
        else if(avg<40)
        {
            System.out.println("fail");
        }
    }
}
