package challenges;

import java.util.ArrayList;
import java.util.Arrays;

// input : 1177722768
// output : "Max Repated 7 value : 4 times"

// input : 11221121
// output : "Max Repated 1 value : 5 times"

public class TestClass2 {
	public static void main(String[] args) {
		System.out.println(wapNum(1177722768));
	}

	public static String wapNum(long num) {
		String str = Long.toString(num);
		String[] arr = str.split("");
		Arrays.sort(arr);
		ArrayList<String> element = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!element.contains(arr[i])) {
				element.add(arr[i]);
				count.add(0);
			}

			if (element.contains(arr[i])) {
				int index = element.indexOf(arr[i]);
				count.set(index, count.get(index) + 1);
			}

			int repeatedValue = 0;
			if (i == arr.length - 1) {
				System.out.println("closed");

				for (int a = 0; a < count.size(); a++) {
					repeatedValue = Math.max(repeatedValue, count.get(a));
				}

				int ele = count.indexOf(repeatedValue);
				String value = element.get(ele);
				return "Max Repated : " + value + " value  : " + repeatedValue + " times";
			}

		}

		return "Something Wrong!";
	}
}
