public class LangStringBufferBuilder152 
{
    public static void main(String[] args) 
    {
        String s1=new String("Hello"); //immutale (can not concate)
        
        StringBuffer s2=new StringBuffer("Hello"); //mutable(Thread safe)
        
        StringBuilder s3=new StringBuilder("Hello"); //mutable(Not Thread safe)
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}