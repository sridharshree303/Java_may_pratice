package pluralsite.iostreams;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class IOStreamsDemo {
	public static void main(String[] args) throws Exception {
		//doTryCatchFinally();        //-- reading data
		//doTryWithResources();		  //-- reading data
		doTryWithResourcesMulti();  //-- reading and writing to another text file
		//doCloseThing();
	}
	
	public static void doTryCatchFinally() {
		char[] buff = new char[8];
		int length;
		Reader reader = null;
	
		try {
			reader = Helper.openReader("demo.txt");
			while((length = reader.read(buff))>=0) {
				System.out.println("\nlength: "+length);
				for(int i = 0; i< length; i++) {
					System.out.print(buff[i]);
				}
			}
		}catch(IOException e) {
			System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
		}finally {
			try {
				if(reader != null)
					reader.close();
			}catch(IOException e2){
				System.out.println(e2.getClass().getSimpleName()+" - "+e2.getMessage());
			}
		}
	}
	
	public static void doTryWithResources() {
		char[] buff = new char[8];
		int length;
		
		try(Reader reader = Helper.openReader("demo.txt")) {
			while((length = reader.read(buff))>=0) {
				System.out.println("\nlength: "+length);
				for(int i = 0; i< length; i++) {
					System.out.println(buff[i]);
				}
			}
		}catch(IOException e) {
			System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
		}
	}
	
	public static void doTryWithResourcesMulti() {
		
		char[] buff = new char[8];
		int length;
		
		try(Reader reader = Helper.openReader("demo.txt");
			Writer writer = Helper.openWriter("file4.docx")) {   // if u gave any file name it will create automatically
			while((length = reader.read(buff))>=0) {
				System.out.println("\nlength: "+length);
				writer.write(buff,0,length);
			}
		}catch(IOException e) {
			System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
		}
	}
	
	@SuppressWarnings("unused")
	private static void doCloseThing() throws Exception {
		try(MyAutoCloseable ac = new MyAutoCloseable()){
			ac.saySomething();
		}catch (IOException e) {
			System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
		}
	}
	
}
