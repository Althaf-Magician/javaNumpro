// Digital Banking application
import java.util.Scanner;
public class ATm 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {

        
        
        // Asking the user to enter the pin number to validate with the previous one
        System.out.println("Enter the Pin number : ");
        int User_pin=sc.nextInt();
        Operations op=new Operations();
        if (op.confirm_pin()==User_pin) 
        {
            System.out.println("Welcome to digital banking");
            int n=0;
            while (n==0) 
            {
                System.out.println("1.add amount to the account : ");
                System.out.println("2.transfer amount from the account : ");
                System.out.println("3. to check the balance : ");
                System.out.println("4. to change the pin number : ");
                System.out.println("5. to Exit ");
                System.out.println("select the above option : ");
                int opt=sc.nextInt();

                if (opt==1) 
                {
                    op.deposite();
                }
                else if (opt==2) 
                {
                    op.transfer();
                } 
                else if (opt==3) 
                {
                    op.balance();
                } 
                else if(opt==4)
                {
                    op.Pin_num();
                } 
                else if (opt==5) 
                {
                    n++;
                }
                
            }
        } 
        else
        {
            System.out.println("please enter the correct pin");
            User_pin=sc.nextInt();
            if (op.confirm_pin()==User_pin) 
            {
            System.out.println("Welcome to digital banking");
            int n=0;
            while (n==0) 
            {
                System.out.println("1.add amount to the account : ");
                System.out.println("2.transfer amount from the account : ");
                System.out.println("3. to check the balance : ");
                System.out.println("4. to change the pin number : ");
                System.out.println("5. to Exit ");
                System.out.println("select the above option : ");
                int opt=sc.nextInt();

                if (opt==1) 
                {
                    op.deposite();
                }
                else if (opt==2) 
                {
                    op.transfer();
                } 
                else if (opt==3) 
                {
                    op.balance();
                } 
                else if(opt==4)
                {
                    op.Pin_num();
                } 
                else if (opt==5) 
                {
                    n++;
                }
                
            }
            }    
            else
            {
                System.out.println("please enter the correct pin");
                User_pin=sc.nextInt();
                if (op.confirm_pin()==User_pin) 
                {
                System.out.println("Welcome to digital banking");
                int n=0;
                while (n==0) 
                {
                    System.out.println("1.add amount to the account : ");
                    System.out.println("2.transfer amount from the account : ");
                    System.out.println("3. to check the balance : ");
                    System.out.println("4. to change the pin number : ");
                    System.out.println("5. to Exit ");
                    System.out.println("select the above option : ");
                    int opt=sc.nextInt();
    
                    if (opt==1) 
                    {
                        op.deposite();
                    }
                    else if (opt==2) 
                    {
                        op.transfer();
                    } 
                    else if (opt==3) 
                    {
                        op.balance();
                    } 
                    else if(opt==4)
                    {
                        op.Pin_num();
                    } 
                    else if (opt==5) 
                    {
                        n++;
                    }
                    
                }
                }    
                else
                {
                    System.out.println("please come after 24 hours your chances are completed");           
                }           
            }           
        }

    }
}
class Operations
{
    static user obj=new user();
    static Scanner sc=new  Scanner(System.in);
    public int confirm_pin()
    {
        return obj.getPin();
    }
    public void transfer()
    {
        System.out.println("Enter the amount to transfer money : ");
        double amt=sc.nextDouble();
        obj.setBalance(obj.getBalance()-amt);
        System.out.println(amt+" rupees has been transfered sucessfully \n enter 1 to diplay balance : ");
        int opt=sc.nextInt();
        if (opt==1) 
        {
            System.out.println(obj.getBalance());    
        }
    }
    public void deposite()
    {
        System.out.println("enter the amount to add to account : ");
        double amt=sc.nextDouble();
        obj.setBalance(obj.getBalance()+amt);
        System.out.println("total amount of money in your account is : "+obj.getBalance());
    }
    public void balance()
    {
        System.out.println(obj.getBalance());
    }
    public void Pin_num()
    {
        int n=0;
        while (n==0) 
        {
            System.out.println("Enter the Previous pin number : ");
            int u_pin=sc.nextInt();
            if (u_pin==obj.getPin()) 
            {
                System.out.println("Enter the New pin : ");
                int new_pin=sc.nextInt();
                System.out.println("confirm the new pin : ");
                int cnew_pin=sc.nextInt();
                if (new_pin==cnew_pin) 
                { 
                    obj.setPin(cnew_pin);
                }    
            }
            else
            {
                System.out.println("Enter the correct pin or press 0 to exit :  ");
                u_pin=sc.nextInt();
                if (u_pin==obj.getPin()) 
                {
                    System.out.println("Enter the New pin : ");
                    int new_pin=sc.nextInt();
                    System.out.println("confirm the new pin : ");
                    int cnew_pin=sc.nextInt();
                    if (new_pin==cnew_pin) 
                    {
                        obj.setPin(cnew_pin);
                    }    
                }
                else if (u_pin==0) 
                {
                    n++;    
                }
            }
        }
    }
}
class user
{

    private String name;
    private int account_Number=875963291;
    private int pin=9876;
    private double balance= 999855;
    // the getter are used to acces the rivate variables :
    public int getAccount_Number() {
        return account_Number;
    }
    public double getBalance() {
        return balance;
    }public String getName() {
        return name;
    }public int getPin() {
        return pin;
    }
    // the stter are used to give values to the private variables
    public void setAccount_Number(int account_Number) {
        this.account_Number = account_Number;
    }public void setBalance(double balance) {
        this.balance = balance;
    }public void setName(String name) {
        this.name = name;
    }public void setPin(int pin) {
        this.pin = pin;
    }
}
