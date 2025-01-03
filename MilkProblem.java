// There is a milk shop where it comtains two types of milk bottles 1.glass botttle cost : 30 ; (by returning the bottle you will get 20 refund )
// there is one more milk bottle which is plastic one cost 15 rupees and no refund will happen.
// tell how many bottles to purchase to buy more amount of milk.
import java.util.*;
public class MilkProblem 
{
    public static void main(String[] args) 
    {
        int glass_bottle=30;
        int plastic_bottle =15;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount to purchase milk : ");
        int amount=sc.nextInt();
        int vol=0;
        int gbot=0;
        int pbot=0;
        while (amount>plastic_bottle) 
        {
            if (amount>=glass_bottle) 
            {
                amount-=30;
                amount+=20;
                vol++;
                gbot++;    
            }
            else if(amount>=plastic_bottle) 
            {
                amount-=15;
                vol++;
                pbot++;
            }
        }
        System.out.println("The number of glass bottles purchased : "+gbot);
        System.out.println("The number of plastic bottles purchased : "+pbot);
        System.out.println("The amount of milk purchased  : "+vol+" balnce is : "+amount);

    }
}
