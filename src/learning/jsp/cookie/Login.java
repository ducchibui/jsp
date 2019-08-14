package learning.jsp.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Documented;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logincookie")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<form action='/JSP/logincookie' method='post'>");
		printWriter.println("user name: <input type='text'name='username' />");
		printWriter.println("password : <input type='password' name='password' />");
		printWriter.println("<input type='submit' value='Submit'/>");
		printWriter.println("</form>");	
		printWriter.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		if(name.equals("chi")&&password.equals("chi")) {
			Cookie cookie = new Cookie(name,password);
			cookie.setMaxAge(20);
			resp.addCookie(cookie);
			resp.sendRedirect("/JSP/welcomecookie");
		} else {
			resp.sendRedirect("/JSP/logincookie");
		}
	}
}
