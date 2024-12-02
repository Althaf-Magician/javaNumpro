import java.util.*;
public class Fibinocci 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last range for fibinocci : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+", ");
        System.out.print(b+", ");
        for (int i = 0; c <=num; i++) 
        {
            System.out.print(c+", ");
            a=b;
            b=c;
            c=a+b;
        }    
    }
}
