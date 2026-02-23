import java.util.Scanner;
public class RelationalChallenge26 {
    public static void main(String args[]) {

        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        year=sc.nextInt();

        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 ==0)
                {
                     System.out.println("Its a leap Year");
                }
                 else 
                   System.out.println("Its not a leap Year");
             }
            else {
                System.out.println("Its a leap Year");
            }
        }
        else 
        {
             System.out.println("Its not a leap Year");
        }
            
        
}
}