// Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

// Note: Stock must be bought before being sold.

// Examples:

// Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
// Output: 8
// Explanation: Buy for price 1 and sell for price 9. 


// Input: prices[] = {7, 6, 4, 3, 1} 
// Output: 0
// Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

// Input: prices[] = {1, 3, 6, 9, 11} 
// Output: 10
// Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]
import java.util.*;
import java.lang.*;
public class Stock_Buy_Sell 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stock_Buy_Sell s=new Stock_Buy_Sell();
        System.out.println("Enter the number of stock available : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println("Enter the "+(i+1)+" stock value :");
            a[i]=sc.nextInt();    
        }
        System.out.println("the profit wil be : "+s.stock(a));
    }
    public int stock(int a[])
    {
        int min=a[0];
        int profit=0;
        for (int i = 1; i < a.length; i++) 
        {
            System.out.println("hello");
           if (min>a[i]) 
           {
            min=a[i]; 
            
           }
           
           if ((a[i]-min) > profit) 
           {
                profit=a[i]-min;
               
           }
        }
        return profit;
    }
}
