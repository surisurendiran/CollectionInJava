package ArrayList;
import java.util.*;

class MyComp implements  Comparator<Employee> {
public int compare(Employee e1,Employee e2) {
		if ( e1.age > e2.age ) 
		return 1;
		else if( e1.age < e2.age ) 
		return -1;	
		else
		return 0;
	}
}
class Employee implements Comparable <Employee>{
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Employee e1) {
		return name.compareTo(e1.name);
	}
}
class ArrayListExample {
	public static void main(String args[]) {
	ArrayList <Employee> a = new ArrayList<Employee>();
	Employee e1 = new Employee("Tom",12);
	Employee e2 = new Employee("Jerry",16);
	Employee e3 = new Employee("Louis",10);
	Employee e4 = new Employee("Clark",11);
	Employee e5 = new Employee("Harris",12);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		Collections.sort(a);
		Iterator<Employee>  i= a.iterator();
		while(i.hasNext() ) {
			Employee x = i.next();
System.out.println("Sorting (Name) : " + x.name + " Age :  " + x.age);
		}
		MyComp c = new MyComp();
		Collections.sort(a,c);
		Iterator<Employee>  i1= a.iterator();
		while(i1.hasNext() ) {
			Employee x = i1.next();
System.out.println("Sorting (Age) : " + x.name + " Age :  " + x.age);
		}
	}
}