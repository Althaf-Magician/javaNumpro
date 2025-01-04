// Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.

// Examples: 

// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.


// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: There is no pair with sum equals to given target.
import java.util.*;
public class Two_Sumpair 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target to check sum : ");
        int target=sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        for (int i = 0; i < a.length; i++) 
        {
            System.out.println("Enter the "+(i)+" element");
            a[i]=sc.nextInt();    
        }
        Two_Sumpair t=new Two_Sumpair();
        if (t.pair(a, target)) 
        {
            System.out.println("The sum pair is possible");    
        } 
        else 
        {
            System.out.println("The sum pair is not possible");
        }
    }
    public boolean pair(int a[], int target)
    {
        Arrays.sort(a);
        int left=0;
        int right=a.length-1;
        while (left<right) 
        {
            int sum=a[left]+a[right];
            if (sum==target) 
            {
                return true;    
            } 
            else if(sum<target) 
            {
              left++;  
            }
            else
            {
                right--;
            }    
        }
        return false;
    } 
}
