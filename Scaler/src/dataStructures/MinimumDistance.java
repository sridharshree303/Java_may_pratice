package dataStructures;

public class MinimumDistance {

	public static void main(String[] args) {
		String A = "xxx...xxx";
		System.out.println(solve(A));
	}

	public static int solve(String A) {
		int minDistance = A.length() - 1;
		char[] arr = A.toCharArray();

		int index ;
		for(index = 0;index < arr.length;index++)  {
			if ('x' == arr[index]) {
				System.out.println(index +" x index");
				int tempCount = 0;
				for (int a = index+1; a < arr.length; a++) {
					tempCount++;
					if ('o' == arr[a]) {
						minDistance = tempCount < minDistance ? tempCount : minDistance;
						index = index + tempCount;
						System.out.println(tempCount + " - tempCount");
						System.out.println(minDistance + " - minDistance");
						System.out.println(index+" - index");
						System.out.println(index +" o index");
						System.out.println("----------------------");
						break;
					}
				}
			} 
			
			if ('o' == arr[index]) {
				System.out.println(index +" o index");
				int tempCount = 0;
				for (int b = index+1; b < arr.length; b++) {
					tempCount++;
					if ('x' == arr[b]) {
						if(tempCount < minDistance) {
							minDistance = tempCount;
							index = index + tempCount;
							System.out.println(tempCount + " - tempCount");
							System.out.println(index+" - o*x");
							System.out.println(minDistance + " - minDistance");
							System.out.println(index +" x index");
							System.out.println(index+" - index");
							System.out.println("---------------------------");
							break;
						}
					}
				}
			}
		}
		
		return minDistance;
	}
}
