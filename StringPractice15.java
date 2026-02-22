import java.lang.*;
public class StringPractice15 {

    public static void main(String args[]) {
      
      String str1="4";
      String str2="s";
      String str3="$";

      System.out.println(str1.matches("\\w"));
      System.out.println(str1.matches("\\d"));
      System.out.println(str1.matches("\\W"));
      System.out.println(str2.matches("\\w"));
      System.out.println(str2.matches("\\d"));
      System.out.println(str2.matches("\\W"));
      System.out.println(str3.matches("\\d"));
      System.out.println(str3.matches("\\D"));
      System.out.println(str3.matches("\\s"));
       

      
    }
}