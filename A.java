import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

public class A {
	public void HandleRequest(String in) {
		//String filename = request.getHeader("X-File-Name");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(in));
		} catch(Exception e) {}
    }
}
