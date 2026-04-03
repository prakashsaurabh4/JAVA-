public class GenericDemo174{
    public static void main(String[] args){

        // Object obj=new String("Hello");
        // String str=(String)obj;

        Object obj1[]=new Object[3];
        obj1[0]="hi";
        obj1[1]="bye";
        obj1 [2]=new Integer(10);

        String str;
        for(int i=0;i<3;i++)
        {
            str=(String)obj1[i];
            System.out.println(str);
        }
    }
}