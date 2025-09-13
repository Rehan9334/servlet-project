package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg")

public class RegisterServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException,IOException
  {
	  UserBean ub=new UserBean();
	  ub.setuName(req.getParameter("uname"));
	  ub.setpWord(req.getParameter("pword"));
	  ub.setfName(req.getParameter("fname"));
	  ub.setlName(req.getParameter("lname"));
	  ub.setCity(req.getParameter("city"));
	  ub.setmId(req.getParameter("mid"));
	  ub.setPhNo(Long.parseLong(req.getParameter("phno")));
	  
	  RegisterDAO ob=new RegisterDAO();
	  int k=ob.register(ub);
	  if(k>0) {
		  RequestDispatcher rd=req.getRequestDispatcher("RegSuccess.jsp");
		  rd.forward(req, rep);
	  }
  }
}
