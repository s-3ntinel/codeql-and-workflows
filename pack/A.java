package pack;

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

public class A extends HttpServlet {

    private static final long serialVersionUID = 6748857432950840322L;
    private static final String DESTINATION_DIR_PATH = "files";
    private static String realPath;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        realPath = getServletContext().getRealPath(DESTINATION_DIR_PATH) + "/";
    }

        public String get(HttpServletRequest request) {
        return request.getHeader("X-File-Name");
        }
}
