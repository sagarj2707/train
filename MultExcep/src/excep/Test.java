package excep;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run() throws IOException, ParseException  {
		//throw new IOException();
		
		throw new ParseException("File Parsing Failed", 2);
	}
	
	public void input() throws IOException, FileNotFoundException{
		
	}

}
