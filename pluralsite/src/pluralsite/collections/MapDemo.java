package pluralsite.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Maps store key/value pairs
// key used to identify / locate values
// Keys are Unique
//Values can be duplicated
//Values can be null

//Common map types
//Interfaces
// Map - Basic map operations
//SortedMap - Map whose keys are sorted

//Class
//HashMap
//TreeMap

//Methods - put,putIfAbsent,get,getOrDefault,values,keySet,forEach,replaceAll

public class MapDemo {

	public static void main(String[] args) {
		//mapdemo();
		sortedmap();
	}
	
	public static void sortedmap() {
	//methods
		//firstKey - return first key
		//lastKey - return last key
		//headMap - return a map for all keys that are less than the specified key
		//tailMap - return a map for all keys that are greater than or equal to the specified key
		//subMap  
		
		SortedMap<String, String> map = new TreeMap<>();
		map.put("2222","ghi");
		map.put("1111","jss");
		map.put("3333","jhs");
		map.put("8888","dsf");
		map.put("6666","red");
		map.put("9999","acb");
		
		map.forEach((k,v)->System.out.println(k+" | "+v)); // returns list
		
		//headMap and tailMap
		SortedMap<String,String>  hMap = map.headMap("8888"); // 1111,2222
		hMap.forEach((k,v)->System.out.println(k+" | "+v));
		
		SortedMap<String,String>  tMap = map.tailMap("3333"); //3333 to 9999
		tMap.forEach((k,v)->System.out.println(k+" | "+v));
		
		
	}

	public static void mapdemo() {
		Map<String, String> map = new HashMap<>();
		map.put("2222", "Sridhar2");
		map.put("1111", "Sridhar");
		map.put("3333", "Sridhar3");

		String s1 = map.get("3333"); // sridhar3
		System.out.println(s1);

		String s2 = map.get("9939"); // null
		System.out.println(s2);

		String s3 = map.getOrDefault("2232", "xyz"); // xyz
		System.out.println(s3);

		//forEach
		map.forEach((k, v) -> System.out.println(k + " | " + v));

		// 2222 | Sridhar2
		// 1111 | Sridhar
		// 3333 | Sridhar3

		//replaceAll
		map.replaceAll((k, v) -> v.toUpperCase());
		map.forEach((k, v) -> System.out.println(k + " | " + v));
	}

}
