package learning.jsp.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/welcomecookie")
public class Welcome extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		String name="";
		for (Cookie c : cookies) {
			name = c.getName();

			if (name.equals("chi")) {
				name = c.getValue();					
			}								
		}
		if(name.equals("")){
			resp.sendRedirect("/JSP/loginCookie");
		}
		printWriter.println("Welcome Chi Bui" + name);
	}
}
