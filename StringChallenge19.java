import java.lang.*;
public class StringChallenge19 {
    public static void main(String args[]) {

        String str="a!B@c#|#2%3";
        String str1="   abc   def  ghi  ijk   ";
        
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(str1.replaceAll(" ", ""));
        System.out.println(str1.replaceAll("\\s+", " ").trim());


        String str2="   abc   def  ghi  ijk   lmn  "; 
        str2=str2.replaceAll("\\s+", " ").trim();
        String words[]=str2.split("\\s");
        System.out.println(words.length);

    }
}