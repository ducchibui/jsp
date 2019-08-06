package study.jsp.chi;

import learning.jdbc.chi.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/AddStudent")
public class AddStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
			
		UpdatePrepareStatement.addStudent(id, firstName, lastName);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
			
		UpdatePrepareStatement.addStudent(id, firstName, lastName);
		
	}
}
