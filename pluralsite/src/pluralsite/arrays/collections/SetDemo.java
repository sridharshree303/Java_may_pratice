package pluralsite.arrays.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		hashsetDemo();
	}
	
	static void hashsetDemo() {
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        
        System.out.println(hash_Set);
        
        // Creating an object of Set class 
        // Declaring object of Integer type 
        Set<Integer> a = new HashSet<Integer>();
        
        // Adding all elements to List 
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
          
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
  
          
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
  
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
  
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        
        //sortedSet
        Set<String> lhs = new TreeSet<String>();
        lhs.add("India");
        lhs.add("Austraila");
        lhs.add("America");
        lhs.add("India");
        lhs.add("Venuzula");
        lhs.add("India");
        System.out.println(lhs);
        
        //Iterator
        Iterator<String> i = lhs.iterator();
        while(i.hasNext())
        	System.out.println(i.next());
	}
}
