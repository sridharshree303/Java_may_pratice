package sample;

public class ReverseArray {

	public int[] reverse(int input1[], int input2)
    {
			int[] b = new int[input2];
	        int j = input2;
	        for (int i = 0; i < input2; i++) {
	            b[j - 1] = input1[i];
	            j = j - 1;
	        }
	        
	        System.out.print("Reversed array is: \n");
	        for (int k = 0; k < input2; k++) {
	            System.out.println(b[k]);
	        }
	        if(b != null)
	        	return b;
	        else
	        	throw new UnsupportedOperationException("reverse(int[] input1,int input2)");
        
    }
  
    public static void main(String[] args)
    {
    	ReverseArray r = new ReverseArray();
        int [] arr = {10, 20, 30, 40, 50};
        r.reverse(arr, arr.length);
    }
}
