package ngtHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

import javax.swing.RepaintManager;

class Data {
	int value;

	public Data(int x) {
		this.value = x;
	}

	public String toString() {
		return "" + value;
	}
}
//class MyFilter implements Predicate<Data>{
//	public boolean test(Data d) {
//		return d.value == 0;
//	}
//}
public class TestClass {
	public static void filterData(ArrayList<Data> datalist, Predicate<Data> f) {
		Iterator<Data> i = datalist.iterator();
		while(i.hasNext()) {
			if(f.test(i.next())) {
				i.remove();
			}
		}
	}
	
	public static void main(String[] args) {
//		ArrayList<Data> a1 = new ArrayList<Data>();
//		Data d = new Data(1); a1.add(d);
//		d = new Data(2); a1.add(d);
//		d = new Data(0); a1.add(d);
////		filterData(a1, new MyFilter());
//		filterData(a1, x -> x.value==0); 
//		
//		System.out.println(a1);
		System.out.println(wapNum(1177722768));
	}
	
	public static String wapNum(long num) {
		String str = Long.toString(num) ;
		String[] arr = str.split("");
		Arrays.sort(arr);
		ArrayList<String> element = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!element.contains(arr[i])) {
				element.add(arr[i]);
				count.add(0);
			}
			
			if(element.contains(arr[i])) {
				int index = element.indexOf(arr[i]);
				count.set(index,count.get(index)+1);
			}
			
			int repeatedValue = 0;
			if(i == arr.length-1) {
				System.out.println("closed");
				
				for(int a = 0;a<count.size();a++) {
					repeatedValue = Math.max(repeatedValue,count.get(a)
							);
				}
				
				int ele = count.indexOf(repeatedValue);
				String value = element.get(ele);
				return "Max Repated : "+ value+" value  : "+repeatedValue+" times" ;
			}
			
		}

		return "Something Wrong!";
	}
	
}






