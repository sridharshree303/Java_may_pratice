package ngtHub;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Magnzine implements Comparable<Magnzine>{
	private String name;
	public Magnzine(String name) {
		this.name = name;
	}
	
	public int compareTo(Magnzine m) {
		return name.compareTo(m.name);
	}
	
	public String toString() {
		return name;
	}

}

public class ComparableDemo {
	public static void main(String[] args) {
		Set<Magnzine> set = new TreeSet<>();
		set.add(new Magnzine("highlights"));
		set.add(new Magnzine("Newsweek"));
		set.add(new Magnzine("highlights"));
		System.out.println(set.iterator().next());
		
//		List<String> ll = new ArrayList<>();
//		ll.add("MOn");
//		ll.add("sun");
//		ll.add("sss");
//		ll.remove(0);
//		System.out.println(ll.get(0));
	}
}
