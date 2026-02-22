import java.lang.*;
import java.util.Scanner;
class BitwiseOperator06 {
    public static void main(String args[]) {
        int x=10,y=6,z,c,d,e,f,g,h;
        z=x&y;
        c=x|y;
        d=x^y;
        e=x<<1;
        f=x<<2;
        g=x>>1;
        h=x>>2;
        System.out.println(z);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}