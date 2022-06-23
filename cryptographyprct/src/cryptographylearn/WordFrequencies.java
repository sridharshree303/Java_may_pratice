package cryptographylearn;
//package cryptographylearnmodule2;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class WordFrequencies {
//
//	private ArrayList<String> myWords;
//	private ArrayList<Integer> myFreqs;
//	
//	public static void main(String[] args) throws IOException {
//		WordFrequencies wd = new WordFrequencies();
//		wd.tester();
//	}
//	
//	public WordFrequencies() {
//		myWords = new ArrayList<String>();
//		myFreqs = new ArrayList<Integer>();
//	}
//	
//	public void findUnique() throws IOException {
//		File file = new File("C:\\\\PostgreSQL\\\\sample.txt");
//		FileReader resource = new FileReader(file);
//		BufferedReader br = new BufferedReader(resource);
//		for(String s : ) {
//			s = s.toLowerCase();
//			int index = myWords.indexOf(s);
//			if(index == -1) {
//				myWords.add(s);
//				myFreqs.add(1);
//			}else {
//				int value = myFreqs.get(index);
//				myFreqs.set(index, value+1);
//			}
//		}
//	}
//	
//	public void tester() throws IOException {
//		findUnique();
//		System.out.println("# unique words :"+myWords.size());
//		for(int k=0;k < myWords.size();k++) {
//			System.out.println(myFreqs.get(k)+"\t"+myWords.get(k));
//		}
//	}
//}
