package ngtHub;

import java.util.function.BiFunction;
import java.util.stream.Stream;



public class DayTen  {
	public static void main(String[] args) {
		BiFunction<String , String, Boolean> compareString= (x,y) -> x.equals(y);
		//System.out.println(compareString.apply("Java8","Java8"));
		
		lambdaDemo();
	
	}
	
	static void lambdaDemo() {
		boolean result = Stream.of("do","re","mi","fajjjjjj","so","la","ti")
				.filter(s ->s.length() > 5 ).peek(System.out::println)
				.allMatch(str -> str.length() < 5);
		//Stream.of("do","re","mi","fa","so","la","ti").forEach(System.out::println);
		System.out.println(result);
	}

	
}
	