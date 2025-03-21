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

public class New extends HttpServlet {

    private static final long serialVersionUID = 67L;
    private static final String DESTINATION_DIR_PATH = "files";
    private static String realPath;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        realPath = getServletContext().getRealPath(DESTINATION_DIR_PATH) + "/";
    }

    @Override
    public String doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {


        String filename = request.getHeader("X-File-Name");
        return filename;
    }
}
