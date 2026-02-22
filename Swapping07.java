import java.lang.*;
class Swapping07 {
    public static void main(String args[]) {
        // int a=10,b=15;
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println(a+ " "+b);  a=15,b=10
        byte a=9,b=12;
        byte c;
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}