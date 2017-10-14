package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
class TestQueue{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Tom");  
queue.add("Jerry");  
queue.add("Mickey");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator<String> itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr1 = queue.iterator();  
while(itr1.hasNext()){  
System.out.println(itr1.next());  
} 
}  }  

