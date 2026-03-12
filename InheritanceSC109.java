class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }

    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}

    public void setAddress(String add)
    {
        address=add;
    }

    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc,String n,String add,String phno,String dob)
    {
        super(acc,n,add,phno,dob);
    }

    public void deposit(long amt)
    {
        balance += amt;
    }

    public void withdraw(long amt)
    {
        balance -= amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc,String n,String add,String phno,String dob)
    {
        super(acc,n,add,phno,dob);
    }

    public void payEMI(long amt)
    {
        balance -= amt;
    }

    public void repay(long amt)
    {
        if(balance == amt)
            balance = 0;
    }
}

public class InheritanceSC109 
{
    public static void main(String[] args) 
    {
        SavingsAccount sa = new SavingsAccount("A101","Rahul","Delhi","9876543210","10-05-2000");

        sa.deposit(5000);
        sa.withdraw(1000);

        System.out.println("Savings Balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount("L201","Amit","Patna","9123456789","05-04-1998");

        la.payEMI(2000);

        System.out.println("Loan Balance: " + la.getBalance());
    }   
}