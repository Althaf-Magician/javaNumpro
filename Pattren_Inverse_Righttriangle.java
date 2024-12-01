// * * * * * * 
//   * * * * *
//     * * * * 
//       * * * 
//         * * 
//           *  
import java.util.*;
public class Pattren_Inverse_Righttriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the Number of Rows : ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columuns : ");
        int col =sc.nextInt();
        for (int i = 0; i <row; i++)
        {
         for (int j = 0; j <col; j++) 
         {
            if (i<=j) 
            {
                System.out.print("* ");    
            } 
            else 
            {
                System.out.print("  ");    
            }
         }   
         System.out.println();
        }    
        sc.close(); 
    }
}
