package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MethodsInArrayList {
	public static void main(String args[]) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");

		arrayList.add(2, "yellow"); // count start from 0, inserting the yellow at the 2nd location of the ArrayList
									// and shifts down every object by 1 position that comes after 2nd location.
		ListIterator<String> itr = arrayList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(arrayList.indexOf("two")); // indexOf() gives the index of object that we have pass to it

		arrayList.remove("four"); 	// you can remove element by giving object or index number.
									// But remember in case of removing element by giving object - Removes the first
									// occurrence of the specified element from this list, if it is present. If the
									// list does not contain the element, it is unchanged

		System.out.println(arrayList.size()); // gives the size of array

		List<String> l = arrayList.subList(2, 4);
		System.out.println("Elements in sublist\t" + l);
		l.clear(); // clear() clears the ArrayList
		ListIterator<String> itr1 = arrayList.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
