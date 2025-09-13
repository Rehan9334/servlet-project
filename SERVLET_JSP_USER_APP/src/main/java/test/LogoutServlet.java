package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
{
	Cookie c[] = req.getCookies();
	if(c==null) {
	req.setAttribute("msg", "Session Expired...");
	req.getRequestDispatcher("Msg.jsp").forward(req, resp);
}else {
	ServletContext sct = req.getServletContext();
	sct.removeAttribute("ub");
	c[0].setMaxAge(0);
	resp.addCookie(c[0]);
	req.setAttribute("msg","User logged out Successfully...");
	req.getRequestDispatcher("Logout.jsp").forward(req, resp);
}
 }
}
