package study.jsp.chi;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/refresh")
public class AutoRefresh extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		resp.setHeader("Refresh", "1");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("current time : " + new java.util.Date());
	}

}
