package arrayListUsage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSubList {
        public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        al.add("six");
        al.add("seven");

        List<String> l=al.subList(2, 5);
        l.clear();                             //clear() clears the ArrayList
        ListIterator<String> itr=al.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

