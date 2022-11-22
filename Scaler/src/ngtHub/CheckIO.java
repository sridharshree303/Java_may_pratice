package ngtHub;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Writer;

public class CheckIO {
	public int getWidgetNumber(byte[] data) throws Exception{
		try(InputStream is = new ByteArrayInputStream(data)){
			is.read(new byte[2]);
			if(!is.markSupported()) return -1;
			is.mark(5); // 6
			is.read();  // 
			is.read();
			is.skip(3);
			is.reset();
			return is.read();
		}
	}
	
//	public static String getNameQuick() throws IOException{
//		final BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\saved.name"));
//		final String name = r.readLine();
//		r.flush();
//		return name;
//	}
//	
//	public static String getNameSafely() throws Exception{
//		try (final BufferedReader r = new BufferedReader(
//				new FileReader("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\saved.name"))){
//			final String name = r.readLine();
//			r.flush();
//			return name;
//		}
//	}
	public static void main(String[] args) throws Exception {
		
		
		
//		System.out.println(getNameQuick());
//		System.out.println(getNameSafely());
		
//		File cake = new File("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\cake.txt");
//		Writer pie = new FileWriter("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\pie.txt");
//		pie.flush();
//		new File("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\fudge.txt").mkdirs();
		
//		final CheckIO p = new CheckIO();
//		System.out.println(p.getWidgetNumber(new byte[] {1,2,3,4,5,6,7}));
//		
		
		
//		Writer w = new FileWriter("C:\\Users\\kosridha\\Desktop\\Learningpath\\NGT_HUB\\Day_7\\couch.txt");
//		try(BufferedWriter bw = new BufferedWriter(w)){
//			bw.write("Blue coach on Sale!");
//		}finally {
////			w.flush();
//			w.close();
//		}
//		
//		Console c = System.console();
//		final String response = c.readLine("Are u happy");
//		System.err.print(response);
	}
}
