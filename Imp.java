import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;

public class Imp {
	public static void main(String args[]) {
		Object o1 = new Object();
		Object o2 = new Object();

		New n = new New();

        PrintWriter writer = null;
        InputStream is = null;
        FileOutputStream fos = null;

        try {
            writer = response.getWriter();
        } catch (IOException ex) {
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        }

        try {
            is = request.getInputStream();
            fos = new FileOutputStream(new File(realPath + n.doPost(o1, o2)));
            IOUtils.copy(is, fos);
            response.setStatus(response.SC_OK);
            writer.print("{success: true}");
        } catch (FileNotFoundException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (IOException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException ignored) {
            }
        }

        writer.flush();
        writer.close();
	}
}
