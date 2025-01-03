import java.util.*;
public class NonFibinociinum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the End limit of Non Fibinocii number requried : ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        for (int i = 1; i < n; i++) 
        {
            if (i!=c) 
            {
                System.out.print(i+", ");
            }
            a=b;
            b=c;
            c=a+b;
            i=c;
        }    
    }
}
