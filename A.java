import java.io.FileOutputStream;
import java.io.File;

public class A {
	public static void main(String args[]) {
        String filename = System.getenv("input");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(filename));
		} catch(Exception e) {}
    }
}
