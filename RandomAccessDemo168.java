import java.io.*;

public class RandomAccessDemo168 
{
    public static void main(String[] args) throws Exception
    {
        byte b[] = {'A','B','C','D','E','F','G','H','I','J'};
        
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        bais.mark(6);
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        bais.reset();
        
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
    }   
}

