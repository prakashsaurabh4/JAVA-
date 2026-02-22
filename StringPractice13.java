import java.lang.*;
public class StringPractice13 {

    public static void main(String args[]) {
        String str1="Pyramid";

        String str2="Pyramid";
        String str3="pyramid";
        String str4=new String("Pyramid");

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str2.equals(str4));
        System.out.println(str2==str4);


        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str4));


        System.out.println(str1.contains("amid"));
        System.out.println(str3.equalsIgnoreCase(str2));
        System.out.println(str1.concat(str3));
        System.out.println(str1 + str3);
            
    }
}