package cryptographylearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class WordLengths {

	public static void main(String[] args) throws Exception {
		WordLengths wd = new WordLengths();
//		wd.reader();
		System.out.println("\n-----------------------------------------------------------");
		wd.counterWord();
		System.out.println("-----------------------------------------------------------");
		wd.countingchars();
	}
	

//	# Write a method indexOfMax that has one parameter named values that is an integer array. 
//	# This method returns the index position of the largest element in values. 
//	# Then add code to the method testCountWordLengths to call indexOfMax to determine the most common word length in the file.

//	public int indexofMax(int [] values) {
//		
//        int maxvalue = 0;
//        int position = 0;
//        for (int i = 0; i < values.length; i++) {
//            if (maxvalue == 0) maxvalue = values[i];
//            else {
//                if (maxvalue < values[i]) {
//                    maxvalue = values[i];
//                    position = i;
//                }
//            }
//        }
//        return position+1;
//    }
	
// Reads files content and prints on console
	
	public void reader() throws IOException {
		FileReader fd = new FileReader("C:\\PostgreSQL\\sample.txt");
		
          int i;    
          while((i=fd.read())!=-1)    
                System.out.print((char)i);    
          fd.close();    
	}



// prints No.of words present in the file.text(integer)

    public void counterWord() throws Exception {  
    	 int count = 0;
    	 int value = 1;
         File file = new File("C:\\PostgreSQL\\sample.txt");
         FileInputStream fis = new FileInputStream(file);
         byte[] bytesArray = new byte[(int)file.length()];
         fis.read(bytesArray);
         String s = new String(bytesArray);
         String [] data = s.split(" ");
         for (int i=0; i<data.length; i++) {
            count++;
         }
         System.out.println("Number of words in the given file are : " +count);
       
         ArrayList<String> arr = new ArrayList<String>();
         ArrayList<Integer> num = new ArrayList<Integer>();
         for(int i = 0;i<data.length;i++) {
        	 if(arr.contains(data[i])) {
        		 int temp = arr.indexOf((data[i]));
        		 int temp1 = num.get(temp);
        		 ++temp1;
        		 num.set(temp,temp1 );
        		 continue;
        	 }
        	 else {
        		 arr.add(data[i]);
        		 num.add(value);
        	 } 
         }
         
         
         System.out.println("size of array "+arr.size());
         for(int a = 0;a<arr.size();a++) {
        	 System.out.println(num.get(a)+" - "+arr.get(a));
         }
         
      }
    
// counting characters only
   
public void countingchars() throws IOException {
        String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        File fil = new File("C:\\PostgreSQL\\sample.txt");
        FileReader file = new FileReader(fil);  
        BufferedReader br = new BufferedReader(file);
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of characters present in given file: " + count);  
        br.close();  
    } 
}

//-----------------------------------------------------------------------

// max repeated times of a number

//public class MaxRepeatingBruteForce {
//    public void MaxRepeatingElement(int [] arrA){
//        int maxCounter = 0;
//        int element=0;
//        for (int i = 0; i <arrA.length ; i++) {
//            int counter =1;
//            for (int j = i+1; j <arrA.length ; j++) {
//                if(arrA[i]==arrA[j]){
//                    counter++;
//                }
//            }
//            if(maxCounter<counter){
//                maxCounter=counter;
//                element = arrA[i];
//            }
//        }
//        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
//    }
//    public static void main(String[] args) {
//     int [] arrA = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
//     MaxRepeatingBruteForce m = new MaxRepeatingBruteForce();
//     m.MaxRepeatingElement(arrA);
//    }
//}