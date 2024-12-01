import java.util.*;
public class GivenCharecter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charecter to check : ");
        char ch=sc.next().charAt(0);
        if (ch>=65&&ch<=90) 
        {
            System.out.println(ch+" is a Upper case alphabet");    
        } 
        else if (ch>=97&&ch<=120) 
        {
        System.out.println(ch+" is a lower case alphabets ");    
        } 
        else if (ch>=48&&ch<=57) 
        {
            System.out.println(ch+" is a numerical digit");
        } 
        else 
        {
            System.out.println(ch+" is a Special sysmbol");
        }
           
    }
}
