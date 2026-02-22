import java.lang.*;
import java.util.Scanner;
class Cuboid04 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int l,b,h;
        float Volume,TP,LSA,TSA;
        System.out.println("Enter the length breadth of the cuboid:");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Volume=l*b*h;
        TP=4*(l+b+h); //total area
        LSA=2*h*(l+b); //lateral surface area
        TSA=2*(l*b+b*h+h*l); //total surface area
        System.out.println(Volume);
        System.out.println(TP);
        System.out.println(LSA);
        System.out.println(TSA);
        System.out.println("Cuboid Volume: " +Volume+ " Total Perimeter " +TP+ " Lateral Surface Area " +LSA+ " Total Surface Area " +TSA);



    }
}