import java.util.*;
public class SortingBYLast 
{
    public static void main(String[] args) 
    { 
        Comparator com=new Comparator<Integer>() {
            @Override
            public int compare(Integer  i,Integer  j) 
            {
              if (i%10>j%10) 
              {
                return 1;  
              } else {
                return -1;
              }
            }
        }; 
        LinkedList<Integer> li=new LinkedList<>();   
        li.add(152);
        li.add(241);
        li.add(99);
        li.add(26);

        System.out.println(li);

        Collections.sort(li);

        System.out.println("after sorting : "+li);
        li.sort(com);
        System.out.println("sorting on last digit"+li);
    }
}
