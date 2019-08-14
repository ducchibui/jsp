package learning.jsp.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookie1")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		Cookie cookie = new Cookie("test","abc");
		cookie.setMaxAge(5);
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("test2","xyz");
		cookie2.setMaxAge(10);
		resp.addCookie(cookie2);
	}
}
