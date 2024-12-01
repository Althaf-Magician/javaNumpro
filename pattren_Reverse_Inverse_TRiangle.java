

// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// *


import java.util.*;
public class pattren_Reverse_Inverse_TRiangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int row=sc.nextInt();
        System.out.println("Enter the Number of columns : ");
        int col=sc.nextInt();
        for (int i =1; i<=row; i++) 
        {
            for (int j =1; j<=col; j++) 
            {
                if ((i+j<=(row+1))) 
                {
                    System.out.print("*  ");
                } 
                else 
                {
                    System.out.print("   ");
                }    
            }   
            System.out.println(); 
        }  
        sc.close();    
    }
}
