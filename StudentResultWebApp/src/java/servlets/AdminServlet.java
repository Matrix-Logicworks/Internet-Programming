package servlets;

import za.ac.tut.bl.StudentFacadeLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Result;
import za.ac.tut.entities.Student;

public class AdminServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("viewAll".equals(action)) {
            List<Student> students = studentBean.getAllStudents();
            request.setAttribute("students", students);
            request.getRequestDispatcher("/admin/view-all.jsp").forward(request, response);
        } else if ("findStudent".equals(action)) {
            String studentId = request.getParameter("studentId");
            Student student = studentBean.findStudent(studentId);
            request.setAttribute("student", student);
            request.getRequestDispatcher("/admin/edit-student-form.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        String action = request.getParameter("action");

        if ("addStudent".equals(action)) {
           
        } else if ("editStudent".equals(action)) {
            String studentId = request.getParameter("studentId");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            Student student = studentBean.findStudent(studentId);
            if (student != null) {
                student.setName(name);
                student.setEmail(email);
                student.setPassword(password);
                studentBean.updateStudent(student);
            }
            response.sendRedirect("admin/success.jsp");
        } else if ("deleteStudent".equals(action)) {
            String studentId = request.getParameter("studentId");
            studentBean.deleteStudent(studentId);
            response.sendRedirect("admin/success.jsp");
        } else if ("addResult".equals(action)) {
            String studentId = request.getParameter("studentId");
            String subject = request.getParameter("subject");
            int marks = Integer.parseInt(request.getParameter("marks"));

            Student student = studentBean.findStudent(studentId);
            if (student != null) {
                Result result = new Result();
                result.setStudent(student);
                result.setSubject(subject);
                result.setMarks(marks);
                studentBean.addResult(result);
            }
            response.sendRedirect("admin/success.jsp");
        }
        
    }
  
}