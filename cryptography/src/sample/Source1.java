package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Source1 {
	public static void main(String[] args) throws IOException {
		  BufferedReader BF= new BufferedReader(new InputStreamReader (System.in));
		  int n = 5;
		  String s ;
	      
	      List <String> arr = new ArrayList<>();
	      for(int i =0;i<n;i++) {
	    	  s = BF.readLine();
	    	  arr.add(i, s);
	      }
	      Collections.sort(arr,Collections.reverseOrder());
			for(String st: arr) {
				System.out.println(st);
			}
	      
	}
}
