public class Methods83 {
    static void change(int X[],int index,int value)  //int A;
    {
        X[index]=value; //A[index]=value;
    }

    static void change2(int a,int value)
    {
        a=value;
    }

    public static void main(String args[]) {
        int A[]={2,4,6,8,10};

        change(A,2,20);

        for(int x:A)
        {
            System.out.println(x);
        }

        int a=10;
        change2(a,20);
        System.out.println("Value of Primitive "+a);
    }
}