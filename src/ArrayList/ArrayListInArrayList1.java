package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListInArrayList1 {
     public static void main(String args[])
    {
         ArrayList<String> al=new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");

        ArrayList<String> al1=new ArrayList<String>(al);
        al1.add("four");
        al1.add("five");
        al1.add("six");

        ListIterator<String> itr=al1.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
//NOTE: Here first arraylist is created and added to al1 then elements are added to the al1
