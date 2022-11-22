package ngtHub;

public class ArryaCheck2 {
	public static void main(String[] args) {
		int a[] = {11,6,17,8,9,34,14};
		System.out.println(guessWhat(a));
		
	}
	
	static int guessWhat(int arr[]) {
		int x = arr[0];
		for(int ele : arr) {
			x = x < ele ? x : ele;
		}
		return x;
		
		//binary search and sorting
	}
}
