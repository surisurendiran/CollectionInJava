package collection;

import java.util.*;
class HashMapDemo
{
   public static void main(String args[])
   {
       HashMap< String,Integer> hm =new HashMap< String,Integer>();   //initialize a map
       hm.put("a", new Integer(5));              //puts an entry in the invoking map
       hm.put("b", new Integer(10));
       hm.put("c", new Integer(15));
       hm.put("d", new Integer(20));       
        	
       Set< Map.Entry< String,Integer> > st = hm.entrySet();  // Returns Set view  
 
       for (Map.Entry< String,Integer> me:st)  //loop a map
       {
           System.out.print(me.getKey()+":");
           System.out.println(me.getValue());
       }
   }
   }
