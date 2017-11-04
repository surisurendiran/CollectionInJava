package collectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[])
    {
        HashSet<String> hs=new HashSet<String>();
        {
            hs.add("a");
            hs.add("b");
            hs.add("c");
            hs.add("a");
            Iterator<String> itr=hs.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }
}