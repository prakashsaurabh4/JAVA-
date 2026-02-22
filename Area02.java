import java.lang.*;
import java.util.Scanner;
public class Area02 {
    public static void main(String args[]) {
        // float base,height,area;
        // System.out.println("Enter Base and Height");
        // Scanner sc=new Scanner(System.in);
        // base=sc.nextFloat();
        // height=sc.nextFloat();

        // area=base*height/2;

        int a,b,c;
        float s;
        double area;
        System.out.println("Enter the side of the triangle ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle " +area);
    }
}