import java.util.*;
public class middledig 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        
        int dup=num;
        int count=0;
        
        while (dup!=0)
        {
            dup=dup/10;
            count++;    
        }
        int mid=0;
        if (count%2==0) 
        {
            mid=count/2;    
        }
        else{
            mid=(count/2)+1;
        }
        while (count!=mid) 
        {
            num=num/10; 
            count--;   
        }
        System.out.println("the middle digit is : "+num%10);
        sc.close();
    }    
}
