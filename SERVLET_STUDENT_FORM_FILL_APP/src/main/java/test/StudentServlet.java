package test;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/register")
public class StudentServlet extends HttpServlet 
{
	private List<Student> students = new ArrayList<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            int age = Integer.parseInt(request.getParameter("age"));
            String course = request.getParameter("course");

            // Validate inputs
            if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
                throw new Exception("Invalid input data");
            }

            Student student = new Student(name, email, age, course);
            students.add(student);

            request.getServletContext().setAttribute("students", students);
            response.sendRedirect("list-students.jsp");
        } catch (Exception e) {
            request.setAttribute("errorMessage", "Error: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
	}
	
}
