import java.io.FileOutputStream;
import java.io.File;
import javax.servlet.http.HttpServletRequest;

public class A {
	public void HandleRequest(String request) {
        //String filename = System.getenv("input");
		//String filename = request.getHeader("X-File-Name");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(request));
		} catch(Exception e) {}
    }
}
