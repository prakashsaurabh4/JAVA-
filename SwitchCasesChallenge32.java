import java.lang.*;
import java.util.Scanner;
public class SwitchCasesChallenge32 {
    public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Website");
        String domain=scan.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com": System.out.println("Commercial");
            break;
            case "org": System.out.println("Organization");
            break;
            case "gov": System.out.println("Government");
            break;
            default :System.out.println("Invalid");
        }
    }
}