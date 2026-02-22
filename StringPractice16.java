import java.lang.*;
public class StringPractice16 {

    public static void main(String args[]) {
      
    String str1="abcde";
    String str2="abc6de";
    String str3="aBcde";
    String str4="abc";
    String str5="abcbba";
    String str6="johm@gmail.com";

    System.out.println(str1.matches(".*"));
    System.out.println(str1.matches("[a-z]*"));
    System.out.println(str2.matches("[a-z]*"));
    System.out.println(str2.matches("[a-z]+"));
    System.out.println(str3.matches("[a-z]*"));
    System.out.println(str4.matches("[abc]*"));
    System.out.println(str4.matches("[abc]{3}"));
    System.out.println(str5.matches("[abc]{3}"));
    System.out.println(str5.matches("[abc]{3,7}"));
    System.out.println(str6.matches(".*gmail.*"));
    System.out.println(str6.matches("\\w*gmail(.*)"));

    }
}