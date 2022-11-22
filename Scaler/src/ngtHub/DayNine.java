package ngtHub;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DayNine {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Sri");
		list.add("ram");
		list.stream().forEach(System.out::println);
		list.stream().forEach(System.out::println);
		
		//5
//		Collection<String> cd = new ArrayList<>();
//		cd.add("Sridhar");
//		cd.add("priya");
//		output(cd);
		
		//4
//		ArrayDeque<Integer> dice = new ArrayDeque<>();
//		dice.offer(3);
//		dice.offer(2);
//		dice.offer(4);
//	
//		dice.stream().filter(n -> n != 4).forEach(System.out::println);
		
		//3
//		List<String> list = new ArrayList<>();
//		list.add("Austin");
//		list.add("Boston");
//		list.add("San Fransico");
//		list.removeIf(a -> a.length() > 10 );
//		System.out.println(list);
		
		//2
//		List<String> values = new ArrayList<>();
//		add(values,"duck");
//		add(values,"duck");
//		add(values,"goose");
//		System.out.println(values);
		
		// 1
//		TreeMap<String, Integer> map = new TreeMap<>();
//		map.put("3",3);
//		map.put("three",3);
//		map.put("THREE", 3);
//		System.out.println(map.firstKey()+" "+map.lastKey());
	}
	
	//5
	private static void output(Collection<String> x) {
		x.forEach(System.out::println);
	}

	// 2
	private static <T extends Collection<String>,String> String add(T list,String element) {
		list.add(element);
		return element;
	}
}
