// perfetc number : sum of the factors(Except the original number) which is equal to the original number ex : 6 =1+2+3 .
import java.util.*;
public class perfectnum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the nuMber to check : ");
        int num=sc.nextInt();
        int sum=0;
        for (int i = 1; i <num; i++)
        {
            if (num%i==0)
            {
                sum=sum+i;    
            }
        }
        if (sum==num) 
        {
            System.out.println(num+" is a perfect number");    
        } 
        else 
        {
            System.out.println(num+" is not a perfect Number");    
        }
    }
}
