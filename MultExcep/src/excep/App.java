package excep;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			test.input();
		} catch (FileNotFoundException e) {
			// FileNotFound should be handled first before IOException always
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
