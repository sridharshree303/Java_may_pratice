package ngtHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Truck implements Comparable<Truck> {
	private int id;
	public Truck(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Truck o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}
	
	public static void main(String[] args) {
		//15
//		Comparator<Integer> c = (x,y) -> y*x;
//		List<Integer> ints = Arrays.asList(3,1,4);
//		Collections.sort(ints,c);
//		System.out.println(Collections.binarySearch(ints,1));
		
		//16
//		List<String> list = new LinkedList<>();
//		list.add("Archie");
//		list.add("X-Men");
//		Stream<String> s = list.stream();
//		
//		s.forEach(System.out::println);
//		list.stream().forEach(a -> System.out.println(a));
		
		//17
//		Wash wash = new Wash();
//		Wash wash = new Wash<String>();
//		Wash<String> wash = new Wash<>();
//		wash.clean("socks");
		
		//18
//		LinkedList<String> list = new LinkedList<>();
//		list.add("Grapes of wrath");
//		list.add("1984");
//		
//		list.stream().forEach(System.out::println);
//		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//20
		List<String> list = new ArrayList<>();
		list.add("Atlanta");
		list.add("Chicago");
		list.add("");
		list.stream().filter(s -> !s.isEmpty()).forEach(System.out::println); 
		//s -> !s.isEmpty()
		//s -> s.length() > 0
		//s -> !s.isEmpty()
	}
}

class Wash<T>{
	T item;
	public void clean(T item) {
		System.out.println("Clean "+item);
	}
}
