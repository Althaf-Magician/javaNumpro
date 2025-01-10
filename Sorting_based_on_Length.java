import java.util.*;
public class Sorting_based_on_Length 
{
    public static void main(String[] args) 
    {
        Comparator com= new Comparator<String>() 
        {
            @Override
            public int compare(String s1, String s2) 
            {
                if (s1.length()==s2.length()) 
                {
                    for (int i = 0; i <s1.length(); i++) 
                    {
                        if (s1.charAt(i)!=s2.charAt(i) && s1.charAt(i)>s2.charAt(i) ) 
                        {
                            return 1;
                        }
                          
                    }
                   
                        return -1;
                     
                }
                else if(s1.length()>s2.length()) 
                {
                    return 1;
                } 
                else 
                {
                    return -1;
                }
            }    
        }; 
        LinkedList<String>li =new LinkedList<>();
        
        li.add("althaf");
        li.add("vasanth");
        li.add("sneha");
        li.add("rahul");
        li.add("akhils");
        li.add("akhile");

        li.sort(com);
        System.out.println(li);

        
    }
}
