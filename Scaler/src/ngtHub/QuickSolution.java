package ngtHub;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

class Roller <E extends Wheel>{
	public void roll(E e) {}
}

class Wheel{}

public class QuickSolution extends Wheel{
	
	public static void main(String[] args) {
		
		Set< Integer> dice = new TreeSet<>();
		dice.add(6);
		dice.add(6);
		dice.add(4);
		int t = (int) dice.stream().filter(n -> n != 4).count();
		System.out.println(t);
		dice.stream().filter(n -> n != 4).forEach(System.out::println);
		
//		Roller<QuickSolution> wheel1 = new Roller<QuickSolution>();
//		//Roller <Wheel> wheel2 = new Roller<QuickSolution>();
//		//Roller <QuickSolution> wheell2 = new Roller<QuickSolution>();
//		Roller<? extends Wheel> wheel3 = new Roller<QuickSolution>();
//		Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
//		//Roller<? super Wheel> wheel5 = new Roller<QuickSolution>();
//		Roller<QuickSolution> wheel5 = new Roller<QuickSolution>();
//		Roller<? super Wheel> wheel6 = new Roller<Wheel>();
		
	}
//	public static int findFast(Stream<Integer> s) {
//		return s.findAny().get();
//	}
//
//	public static int findSlow(Stream<Integer> s) {
//		return s.parallel().findFirst().get();
//	}
	
//	public static void main(String[] args) {
//		Stream<Integer> s1 = Arrays.asList(1,2,3,4,5).stream();
//		Stream<Integer> s2 = Arrays.asList(1,2,3,4,5).stream();
//		int val1 = findFast(s1);
//		int val2 = findSlow(s2);
//		System.out.println(val1+" "+val2);
//	}
}
