package study.jsp.chi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/form-add-student")
public class FormStudent extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<form action='/JSP/AddStudent' method='get'>");
		printWriter.println("id: <input type='text' name ='id'><br/>");
		printWriter.println("First Name: <input type='text' name='firstname'/><br/>");
		printWriter.println("Last Name: <input type='text' name='lastname'/><br/>");
		printWriter.println("<input type='submit' value='Submit'/>");
		printWriter.println("</form>");
	}

}
