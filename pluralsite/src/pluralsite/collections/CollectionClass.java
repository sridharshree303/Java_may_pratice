package pluralsite.collections;

import java.util.TreeSet;

//common collection interfaces

	// Collection - Basic collection operations
	// List
	// Queue
	// Set
	// SortedSet

//Common collection Classes
	//ArrayList
	//LinkedList
	//HashSet
	//TreeSet - SortedSet

//Sorting
//Some collections rely on sorting
   // Tow ways to specify sort behavior

//Comparable Interface
	//implemented by the type to be sorted
	//Type specifies own sort behavior
	//should be consistent with equals

//Comparator interface
	//Implemented by type to perform sort
	//specifies sort behavior for another type

public class CollectionClass {
	
	public static void main(String[] args) {
		TreeSet<MyClass> tree = new TreeSet<>();
		tree.add(new MyClass("2222","ghi"));
		tree.add(new MyClass("3333","abc"));
		tree.add(new MyClass
				("1111","dfs"));
		
		tree.forEach(m -> System.out.println(m));
	}
	
}
























