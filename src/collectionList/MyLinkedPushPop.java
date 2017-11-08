package collectionList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedPushPop {
public static void main(String args[])
    {
         LinkedList ll=new LinkedList();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        
        ll.pop();       //pop an element from beginning*
        
        ll.push("odd");     //  push new element at the beginning*
        ll.push("odd1");
        Iterator itr=ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}