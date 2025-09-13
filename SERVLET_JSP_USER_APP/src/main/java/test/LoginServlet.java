package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")

public class LoginServlet extends HttpServlet 
{
protected void doPost(HttpServletRequest req,HttpServletResponse rsp)throws ServletException,IOException
{
	String uN=req.getParameter("uname");
	String pW=req.getParameter("pword");
	
	LoginDAO ld=new LoginDAO();
	UserBean ub=ld.login(uN, pW);
	if(ub==null) {
		req.setAttribute("msg", "Invalid Login Process...<br>");
		//request Object added the variable msg
		
		RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
		rd.forward(req, rsp);
	}else {
		ServletContext sct=req.getServletContext();
		
		sct.setAttribute("ub", ub);
		Cookie ck=new Cookie("fname",ub.getfName());
		rsp.addCookie(ck);
		RequestDispatcher rd=req.getRequestDispatcher("LogSuccess.jsp");
		rd.forward(req, rsp);
	}
}
}
