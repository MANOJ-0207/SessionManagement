

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HiddenServlet2
 */
@WebServlet("HiddenServlet2")
public class HiddenServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String dept=request.getParameter("dept");
    	response.setContentType("text/html");
    	PrintWriter pw=response.getWriter();
    	pw.write("<h1>Name : "+name+"</h1>");
    	pw.write("<p>Dept : "+dept+"</p>");
	}

	
}
