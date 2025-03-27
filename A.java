import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;

public class A {
	public void HandleRequest() {
        //String filename = System.getenv("input");
		//String filename = request.getHeader("X-File-Name");

		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		try {
	        FileOutputStream fos = new FileOutputStream(new File(in));
		} catch(Exception e) {}
    }
}
