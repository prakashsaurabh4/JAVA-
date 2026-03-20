enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");  //(All ENUM name should be capital letter)
    
    String head;
    String location;
    
    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
    public void display()
    {
        System.out.println(this.name()+ " "+this.ordinal());
    }
}

public class LangEnumDemo154 
{
    public static void main(String[] args) 
    {
        Dept d=Dept.ECE;
        d.display();        
        System.out.println(d.ordinal());
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
            
    }   
}