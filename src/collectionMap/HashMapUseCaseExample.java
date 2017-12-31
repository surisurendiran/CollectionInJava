package collectionMap;
import java.util.*;    

class Bank {        
String id,name,Sector,Branch;      
public Bank(String id, String name, String Sector, String Branch) {    
    this.id = id;    
    this.name = name;    
    this.Sector = Sector;    
    this.Branch = Branch;        
}    
}    

public class HashMapUseCaseExample {
	public static void main(String[] args) {    
	    //Creating map of Bank Records    
	    Map<Integer,Bank> map=new HashMap<Integer,Bank>();    
	    //Creating Banks Records    
	    Bank b1=new Bank("IT","Alice","Corporate","IT");    
	    Bank b2=new Bank("SC","Helen","School","");    
	    Bank b3=new Bank("RL","Klein","Galvin","Wiley");    
	    //Adding Information to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Bank> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Bank b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.Sector+" "+b.Branch);   
	    }    
	}    
	
}
