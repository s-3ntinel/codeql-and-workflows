import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

public class A {
	public void HandleRequest(HttpServletRequest request) {
		//df
		String filename = request.getHeader("X-File-Name");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(filename));
		} catch(Exception e) {}
    }
}
