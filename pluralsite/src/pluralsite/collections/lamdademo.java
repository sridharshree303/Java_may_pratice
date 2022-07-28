package pluralsite.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//Collection methods that leverage lamda's
		//forEach - perform code on each member
		//removeIf - remove element if test is true

public class lamdademo {
	public static void main(String[] args) {
		retriveCol();
		
		ArrayList<MyClass> list = new ArrayList<>();
		
		MyClass v1 = new MyClass("v1", "abc");
		MyClass v2 = new MyClass("v2", "xyz");
		MyClass v3 = new MyClass("v3", "abc");
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		System.out.println("----forEach------");
		list.forEach(m -> System.out.println(m.getValue()));
		System.out.println("-----removeIf----");
		list.removeIf(m -> m.getValue().equals("abc")); // v2
		
	}
	
	//Retrieving a collection from an Array
	public static void retriveCol() {
		MyClass[] myArray = {
				new MyClass("v1", "abc"),
				new MyClass("v2", "xyz"),
				new MyClass("v3", "abc")
		};
		
		Collection<MyClass> list = Arrays.asList(myArray);
		
		list.forEach(c -> System.out.println(c.getLabel()));
	}
}

