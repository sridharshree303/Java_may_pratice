package java_strings;

// Java StringBuilder Class is used to create mutable (modifiable) String
public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I Like Coding");
		System.out.println(sb); // I Like Coding
		
		//append()
		sb.append(" and Coffee");
		System.out.println(sb); // I Like Coding and Coffee
		
		//insert(index,string)
		sb.insert(13,",Gaming");
		System.out.println(sb); //I Like Coding,Gaming and Coffee
	
		//replace(startIndex,LastIndex,String)
		sb.replace(2, 6, "Love");
		System.out.println(sb);  //I Love Coding,Gaming and Coffee
		
		//delete(start,endIndex)
		StringBuilder ss = sb.delete(13, 20);
		System.out.println(sb); //I Love Coding and Coffee
		System.out.println(ss); //I Love Coding and Coffee
		
		//toString()
		String str = sb.toString();
		System.out.println(str); //I Love Coding and Coffee
		
		//reverse
		sb.reverse();
		System.out.println(sb); //eeffoC dna gnidoC evoL I
		
	}

}
