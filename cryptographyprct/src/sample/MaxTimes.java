package sample;

public class MaxTimes {
	public static void main(String[] args) {
		MaxTimes m = new MaxTimes();
		System.out.println(m.maxElement("sridhdhss"));
	}
	public String maxElement(String input1) {
	
		String str = input1;  
    	int[] freq = new int[str.length()];  
    	char maxChar = str.charAt(0);  
    	int i, j, min, max;          
      
    	char string[] = str.toCharArray();
      
    	for(i = 0; i < string.length; i++) {  
    		freq[i] = 1;  
    		for(j = i+1; j < string.length; j++) {  
    			if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
    				freq[i]++;   
    				string[j] = '0';  
    			}  
    		}  
    	}  
        String s;
	    max = freq[0];  
	    for(i = 0; i <freq.length; i++) {  
	        if(max < freq[i]) {  
	            max = freq[i];  
	            maxChar = string[i];
	            
	        } 
	    }
	    if(maxChar != 0) {
	    	s=Character.toString(maxChar);
	    	return s;
	    }else
        	throw new UnsupportedOperationException("maxElement(String input1");
	   
	}  
}
