public class Methods81 {
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String args[]){
        int a=10,b=15;

        Methods81 mp=new Methods81();
        System.out.println(mp.max(a,b));
    }
}