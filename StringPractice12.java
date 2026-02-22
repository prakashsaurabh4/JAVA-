import java.lang.*;
public class StringPractice12 {

    public static void main(String args[]) {

        String str1="Mr. Saurabh Prakash";

        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Sau"));
        System.out.println(str1.endsWith("Mr."));
        System.out.println(str1.endsWith("kash"));
        System.out.println(str1.charAt(4));
        System.out.println(str1.indexOf("."));
        System.out.println(str1.lastIndexOf("."));
        System.out.println(str1.indexOf("Saurabh"));


        for(int i=0;i<str1.length();i++)
        System.out.println(str1.charAt(i));
        // System.out.print(str1.charAt(i)); Mr. Saurabh Prakash

    }
}
