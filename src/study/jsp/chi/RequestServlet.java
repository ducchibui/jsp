package study.jsp.chi;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test-request")
public class RequestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Phuong thuc cua request "+ req.getMethod());
		System.out.println(req.getSession());		
		System.out.println(req.getServletPath());
		
		Enumeration<String> enumeration = req.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println(key + " : " + req.getHeader(key));
		}
	}
}
