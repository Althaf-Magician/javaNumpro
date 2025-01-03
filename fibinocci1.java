import java.util.Scanner;
public class fibinocci1 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the NUmber of Fibinocci Digits required : ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+", ");
        System.out.print(b+", ");
        for (int i = 1; i<=n-2; i++) 
        {
            c=a+b;
            
                System.out.print(c+", ");    
            
            a=b;
            b=c;    
        }
    }
}
