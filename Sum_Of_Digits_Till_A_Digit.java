import java.util.*;
public class Sum_Of_Digits_Till_A_Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        int dup1=num;
        int finalans=0;
        int n=0;
        while ( n==0)
        {
            int sum=0;
            while (num!=0) 
            {
                sum=sum+num%10;
                num=num/10;
            }
            int dup=sum;
            int count=0;
            while (dup!=0) 
            {
                dup=dup/10;
                count++;    
            } 
            if (count==1) 
            {
                n++;
                finalans=sum;  
            }
            num=sum;
        }
        sc.close();
        System.out.println("The Sum of "+dup1+" digits till single digit is : "+finalans);
    }
}
