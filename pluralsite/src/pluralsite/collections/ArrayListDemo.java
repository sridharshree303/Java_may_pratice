package pluralsite.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		arraylistdemo();
	}
	
	//generics are provides data type security in array
	//collection methods -- size,clear,isEmpty,add,addAll
	//Common equality methods - contains,containsAll,remove,removeAll,retainAll
	public static void arraylistdemo() {
		ArrayList<String> list = new ArrayList<>();
		list.add("sridhar");
		list.add("Sridhar2");
		list.add("Sridhar3");
	
		System.out.println("lenght : "+list.size());
		
		for(String str: list)
			System.out.println(str);
		
		String s = list.get(1);
		System.out.println(s);
		
		
		
	}
}
