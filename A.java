import java.io.FileOutputStream;
import java.io.File;
import javax.servlet.http.HttpServletRequest;

public class A {
	public void HandleRequest(HttpServletRequest request) {
        //String filename = System.getenv("input");
		String filename = request.getHeader("X-File-Name");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(filename));
		} catch(Exception e) {}
    }
}
