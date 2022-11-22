package ngtHub;

import java.util.concurrent.ConcurrentHashMap;

public class SyncronizeDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> obj = new ConcurrentHashMap<>();
		obj.put("Sri", 120);
		obj.put("Szi", 125);
		
		obj.putIfAbsent("Szi", 125);
		obj.put("priya", 021);
		System.out.println(obj);
	}
}
