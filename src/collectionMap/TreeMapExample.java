package collectionMap;
import java.util.*;
public class TreeMapExample 
{
    public static void main(String[] args) 
   {
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(1, "Monday");
        tmap.put(2, "Tuesday");
        tmap.put(4, "Thrusday");
        tmap.put(6, "Saturday");
        SortedMap<Integer, String> Tsubmap;
        Tsubmap = tmap.subMap(3, 7);
        System.out.println(tmap + " " + Tsubmap);
        tmap.put(3, "Wednesday");
        Tsubmap.put(5, "Friday");
        tmap.put(7, "Sunday");
        System.out.println(tmap + " " + Tsubmap); 
    }
}