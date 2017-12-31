package ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListInArrayList {
     public static void main(String args[])
	{
		ArrayList<Serializable> al = new ArrayList<Serializable>();
		al.add("one");
		al.add("two");
		al.add("three");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("four");
		al1.add("five");
		al1.add("six");

		al.add(al1);
		ListIterator<Serializable> itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

//NOTE: Here two arraylist are created then al1 is added into al



