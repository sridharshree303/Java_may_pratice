package pluralsite.arrays.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		demo();
	}
	
	static void demo() {
		List<Integer> list = new ArrayList<>();
		//add elements
		list.add(100);
		list.add(300);
		list.add(200);
		
		System.out.println(list);
		
		//Add All
		List<Integer> listA = new ArrayList<>();
		listA.add(400);
		listA.add(300);
		listA.add(500);
		
		list.addAll(listA);
		System.out.println(list);
		
		//remove - deleting
		list.remove(4);
		System.out.println(list);
		
		//set - updating or replace
		list.set(4,700);
		System.out.println(list);
		
		//iterating
		list.forEach(li -> System.out.println(li));
		for(int li : list)
			System.out.print(li+" ");
		
		//Hash Code
		System.out.println(list.hashCode());
	}
}	
