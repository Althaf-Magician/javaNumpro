import java.util.*;
public class Even_Odd 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to check : ");
        int num =sc.nextInt();
        if (num%2==0)
        {
            System.out.println(num+" is Even Number");  
        }
        else
        {
            System.out.println(num+" is odd number ");
        }    
        sc.close();
    }    
}
