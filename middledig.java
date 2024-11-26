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
        int mid=count/2;
        while (dup!=0)
        {
            dup=dup/10;
            count++;    
        }
        while (count!=mid) 
        {
            num=num/10;    
        }
        System.out.println(num);
        System.out.println(num%10);
        sc.close();
    }    
}
