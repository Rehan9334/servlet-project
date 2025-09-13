package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/form")


@SuppressWarnings("serial")
public class FormServlet extends HttpServlet 
{
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // Retrieve form parameters
        String employeeId = req.getParameter("employeeId");
        String employeeName = req.getParameter("employeeName");
        String employeeAddress = req.getParameter("employeeAddress");
        String employeeSalary = req.getParameter("employeeSalary");
        String gender = req.getParameter("gender");
        String profile = req.getParameter("profile");
        String[] hobbies = req.getParameterValues("hobbies");

        // Generate the response
        out.println("<html><body>");
        out.println("<h2>Employee Information:</h2>");
        out.println("<p>Employee Id: " + employeeId + "</p>");
        out.println("<p>Employee Name: " + employeeName + "</p>");
        out.println("<p>Employee Address: " + employeeAddress + "</p>");
        out.println("<p>Employee Salary: " + employeeSalary + "</p>");
        out.println("<p>Employee Gender: " + gender + "</p>");
        out.println("<p>Employee Profile: " + profile + "</p>");

        out.print("<p>Employee Hobbies: ");
        if (hobbies != null) {
            out.print(String.join(", ", hobbies));
        } else {
            out.print("None");
        }
        out.println("</p>");
        out.println("</body></html>");
	}
}
