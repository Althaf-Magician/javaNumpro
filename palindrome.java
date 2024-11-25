import java.util.*;
public class palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to check : ");
        int num=sc.nextInt();
        int dup=num;
        int rev=0;
        while (num!=0)
        {
            rev=(rev*10)+(num%10);
            num=num/10;    
        }
        if (rev==dup)
        {
            System.out.println(rev+" is a palindome NUmber");    
        } 
        else 
        {
            System.out.println(dup+" is not a palindome NUmber");
        }
    }    
}
