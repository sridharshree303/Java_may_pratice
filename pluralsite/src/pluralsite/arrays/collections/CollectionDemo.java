package pluralsite.arrays.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Adding elements to the Collections 
//Sorting a Collection
//Searching in a Collection
//Copying Elements
//Disjoint Collection		

public class CollectionDemo {

	public static void main(String[] args) {
		sorting();
	}
	
	//sorting
	static void sorting() {
		List<String> list = new ArrayList<>();
		list.add("Sridhar");
		list.add("Vishnu");
		
		//Add All
		Collections.addAll(list,"Teja","Surekha");
		System.out.println("list - "+list);
		
		//Sorting
		Collections.sort(list);
		System.out.println("sort - "+list);
		
		//Binary search
		System.out.println("The index of Teja is "
					+Collections.binarySearch(list,"Teja"));
		
		//Another list
		List <String> listA = new ArrayList<>();
		listA.add("Vamsi");
		listA.add("Chandhu");
		listA.add("Sridhar");
		
		//Disjoint - if no common elements return true else false
		System.out.println(Collections.disjoint(list, listA));
		
		
		//Copy - replaces the index of list elements by listA
		Collections.copy(list,listA);
		System.out.println("copy - "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse - "+list);
		
		
		
	}

}
