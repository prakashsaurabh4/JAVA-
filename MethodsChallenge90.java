import java.util.Scanner;

public class MethodsChallenge90 
{
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age)
    {
        return age >= 3 && age <= 15;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MethodsChallenge90 obj = new MethodsChallenge90();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(obj.validate(name))
            System.out.println("Valid Name");
        else
            System.out.println("Invalid Name");

        if(obj.validate(age))
            System.out.println("Valid Age");
        else
            System.out.println("Invalid Age");

        sc.close();
    }
}