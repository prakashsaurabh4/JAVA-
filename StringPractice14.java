import java.lang.*;
public class StringPractice14 {

    public static void main(String args[]) {
      
      String str1="a";
      String str2="abc";
      String str3="p";
      String str4="s";
      String str5="%";
      String str6="a8";

      System.out.println(str1.matches("."));
      System.out.println(str2.matches("."));
      System.out.println(str3.matches("[^abc]"));
      System.out.println(str4.matches("[a-z0-9]"));
      System.out.println(str5.matches("[a-z0-9]"));
      System.out.println(str6.matches("[a-z][0-9]"));

    }
}        