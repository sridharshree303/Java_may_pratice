package pluralsite.iostreams;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {

	public void saySomething() throws IOException{
		System.out.println("Something...");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
