import java.lang.*;
public class StringChallenge18 {
    public static void main(String args[]) {

        int b=1010110;
        String str=b+"";
        String str1="17339AEBC87";

        System.out.println(str.matches("[01]*"));
        System.out.println(str.matches("[01]+ "));
        
        System.out.println(str1.matches("[0-9A-F]*"));
        System.out.println(str1.matches("[0-9A-F]+ZZZ"));

    }
}