import java.util.ArrayList;
import java.util.List;

public class ArrayList178{
    public static void main(String[] args){
        ArrayList<Integer> al1=new ArrayList<>(20);

        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(al2);

        System.out.println(al1);
        System.out.print(al1.contains(250));
    }
}