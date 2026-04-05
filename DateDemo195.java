import java.util.*;
public class DateDemo195 
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);

        Date d=new Date(); //also give parameters
        System.out.println(d);
        System.out.println(d.getYear()+1900);
    }
}