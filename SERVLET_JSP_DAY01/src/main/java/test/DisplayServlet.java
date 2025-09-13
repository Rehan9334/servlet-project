package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")

public class DisplayServlet implements Servlet {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		
		return "Display Servlet";
	}

	@Override
	public void init(ServletConfig scf) throws ServletException {
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String uName = req.getParameter("uname");
		String mId = req.getParameter("mid");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("******Details*****");
		pw.println("UserName:"+uName+"<br>");
		pw.println("MailId:"+mId+"<br>");
		
	}

}
