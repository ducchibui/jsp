package learning.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebFault;

@WebServlet(urlPatterns = "/session1")
public class Session extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("name","Bui Duc Chi");
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Xin chao Chi Bui -- set Session");
		
	}
}
