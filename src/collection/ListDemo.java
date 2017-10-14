package collection;
import java.util.*;
public class ListDemo
{
 public static void main (String[] args)
 {
     // creation of a list
     List<Integer> l1 = new ArrayList<Integer>();
     l1.add(0, 1);  						// adds 1 at index 0
     l1.add(1, 2);  						// adds 2 at index 1
     System.out.println(l1); 
     // creating another list
     List<Integer> l2 = new ArrayList<Integer>();
     l2.add(1);
     l2.add(2);
     l2.add(3);
     // it will add list l2 from 1 index
     l1.addAll(1, l2);
     System.out.println(l1);
     l1.remove(1);     						// it will remove element from index 1
     System.out.println(l1);  
     // it will print element at index 3
     System.out.println(l1.get(3));
     l1.set(0, 5);   						// it will replace 0th element with 5
     System.out.println(l1);  
 }}
