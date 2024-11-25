import java.util.*;
public class primenum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number to check : ");
        int num=sc.nextInt();
        int count=0;
        for (int i = 2; i <=num/2; i++)
        {
            if (num%i==0) 
            {
                count++;    
            }
        }
        if (count==0) 
        {
            System.out.println("The "+num+" is prime number");    
        }
        else
        {
            System.out.println("The "+num+" is not prime number");
        }
    }
    
}