import java.util.*;
public class factor 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to print the factors : ");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++)
        {
            if (num%i==0) 
            { 
                System.out.println(i+" is the factor of "+num);    
            }    
        }    
        sc.close();
    }    
}
