package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListAdd {
public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");

		al.add(2, "yellow"); // count start from 0, inserting the yellow at the 2nd location of the ArrayList
							// and shifts down every object by 1 position that comes after 2nd location.
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al.indexOf("two")); // indexOf() gives the index of object that we have pass to it
	}
}
