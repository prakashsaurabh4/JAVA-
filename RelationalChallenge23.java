import java.util.Scanner;
public class RelationalChallenge23 {
    public static void main(String args[]) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age : ");
        age=sc.nextInt();

    if(age>=16 && age<=55)
    {
        System.out.println("Young");
    }
    else if(age<16)
    {
        System.out.println("Not Young");
    }
    else
    {
        System.out.println("OLD");
    }
    }
}