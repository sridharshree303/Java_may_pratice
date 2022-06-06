package sample;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;

public class Source {

	public static void main(String[] args) throws Exception {
			Source sc = new Source();
			sc.task(5);
	}
	public void task (int n) {
		List <String> arr = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		String str;
		
		for(int i=0;i<n;i++) {
			str = s.nextLine();
			arr.add(str);
		}
		
		Collections.sort(arr,Collections.reverseOrder());
		for(String st: arr) {
			System.out.println(st);
		}
		s.close();
	}
}
