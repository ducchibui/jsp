package study.jsp.chi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learning.jdbc.chi.GetAllStudents;
import learning.jdbc.chi.Student;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		boolean isFound = false;
		PrintWriter printWriter = resp.getWriter();


		String username = req.getParameter("username");
		List<Student> studentList = GetAllStudents.getAllStudent();

		for (Student s: studentList) {
			if(username.equalsIgnoreCase(s.getFirstName())) {	
				isFound = true;
			}}
		if(isFound) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
			requestDispatcher.forward(req, resp);
		} else {
			printWriter.println("Invalid user");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/form-login");
			requestDispatcher.include(req, resp);
		}
	}
}

