import java.lang.*;
public class StringPractice10 {

    public static void main(String args[]) {

        String str = new String("netbeans");

        int len=str.length();

        // System.out.println(str.length()); 
        System.out.println(len);   

        String str2=str.toUpperCase();
        String str3=str.toLowerCase();
        
        System.out.println(str2);  

        System.out.println(str3);
        

    }
}
