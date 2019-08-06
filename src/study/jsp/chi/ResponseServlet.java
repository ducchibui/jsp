package study.jsp.chi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/response")
public class ResponseServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<h1>Xin chao Trung tam Java</h1>");
		
		resp.addCookie(new Cookie("aa", "AAAA"));
		resp.addHeader("chi", "test");
		resp.sendError(200);
		
		ArrayList<String> enumerations =(ArrayList<String>) resp.getHeaderNames();
		for(String e: enumerations) {
			
			System.out.println(e + ":"+resp.getHeader(e));
			
		}
		
		Enumeration<String> enumeration = req.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println(key + " : " + req.getHeader(key));
		}
	}
}
