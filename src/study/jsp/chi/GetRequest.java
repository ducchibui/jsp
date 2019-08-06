package study.jsp.chi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test-param")
public class GetRequest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String language = req.getParameter("language");
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("the name is: " + name + " and language is: "+ language);
	}

}
