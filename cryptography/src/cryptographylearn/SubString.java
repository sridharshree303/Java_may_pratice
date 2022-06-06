package cryptographylearn;

public class SubString {

	public static void main(String[] args) {
		
		textFingerPrint("djfgsjhfjkshjskjdkj");
	}
	
	public static void textFingerPrint(String s) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] counters = new int[26];
		for ( int k=0; k<s.length(); k++) {
			char ch = s.charAt(k);
			int index = alpha.indexOf(Character.toLowerCase(ch));
			if(index != -1) {
				counters[index] += 1;
			}
		}
		//print all counter alphabet values
		for(int k=0; k<counters.length;k++) {
			System.out.println(alpha.charAt(k)+"\t"+counters[k]);
		}
		char c = 0;
		for(int k=0; k<counters.length;k++) {
				int count = 0;
				c = (char) Math.max(counters[count],counters[k]);
				
				count++;
			}
		System.out.println("Max is : "+c);
		}
	
}
