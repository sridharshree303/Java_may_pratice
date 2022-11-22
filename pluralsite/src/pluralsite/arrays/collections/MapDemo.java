package pluralsite.arrays.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		//mapDemo();
		//hashmapDemo();
		//linkedHashmapDemo();
		treemapDemo();
	}
	
	static void mapDemo() {
		List<String> list = new ArrayList<String>();
		Map<String,List<String>> map = new HashMap<>();
		map.put("Sridhar", list);
		map.put("Vishnu", list);
		map.put("Surekha", list);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<String, List<String>> me : map.entrySet()) {
			System.out.println(me.getKey()+" : "+me.getValue());	
		}
	}
	
	static void hashmapDemo() {
		 HashMap<Integer,String> m=new HashMap<Integer,String>();  
	       m.put(101,"Chris");  //Adding elements in Map    
	       m.put(103,"Morris");      
	       m.put(102,"Sam");     
	       m.put(99,"Cruise");      
	       System.out.println("Iterating Hashmap...");    
	       for(Map.Entry me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());      
	       }    
	}
	
	static void linkedHashmapDemo() {
		 LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();  
	       m.put(101,"Chris");  //Adding elements in Map    
	       m.put(103,"Morris");      
	       m.put(102,"Sam");     
	       m.put(99,"Cruise");      
	       System.out.println("Iterating Hashmap...");    
	       for(Map.Entry me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());      
	       }    
	}
	
	static void treemapDemo() {
		 Map<String,String> m=new TreeMap<String,String>();  
	       m.put("Sri","Chris");  //Adding elements in Map    
	       m.put("Teja","Morris");      
	       m.put("Vishnu","Sam");     
	       m.put("Surekha","Cruise");      
	       System.out.println("Iterating Hashmap...");    
	       for(Map.Entry me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());      
	       }    
	}
}
