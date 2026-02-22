import java.lang.*;
public class StringPractice11 {

    public static void main(String args[]) {

        String str=new String("   netbeans  ");

        String str1=str.trim();
        System.out.println(str1);
            
        String str2=str.substring(3,7);
        System.out.println(str2);

        String str3=str.replace('e','L');
        System.out.println(str3);
    }
}