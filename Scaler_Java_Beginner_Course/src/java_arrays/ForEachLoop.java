package java_arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		int [] arr = {1,2,3,5,3,6};
		int key =3;
		//for each
		for(int a : arr) {
			System.out.print(a+" - ");
			System.out.println(Math.pow(a, 2));
		}
		
		//check whether the given the key value is present in the array
		boolean found = false;
		
		for(int ab : arr) {
			if(ab ==  key) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}
}
