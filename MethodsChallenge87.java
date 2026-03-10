public class MethodsChallenge87 {

    static int max(int x,int y)
    {
        return x>y?x:y;
    }

    static float max(float x,float y)
    {
        return x>y?x:y;
    }

    static int max(int x,int y,int z)
    {
        return x>y && x>z ? x : (y>z?y:z);
    }


    public static void main(String args[]) {
        System.out.println(max(10,14));
        System.out.println(max(1,8,9));
        System.out.println(max(10.2f,14.3f));
    }
}