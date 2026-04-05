import java.util.*;

public class DequeDemo180 
{   
    public static void main(String[] args) 
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10); // adding element
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();  // queue(Deleting from first)
         
         dq.offerLast(1);
         dq.offerLast(2);
         dq.offerLast(3);
         dq.offerLast(4);
         
         dq.forEach((x)->System.out.println(x));
         
    }    
}