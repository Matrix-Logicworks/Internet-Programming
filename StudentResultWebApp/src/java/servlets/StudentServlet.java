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

/**
 *
 * @author Dikot
 */
public class StudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("viewResults".equals(action)) {
            String studentId = request.getRemoteUser(); // Get logged-in user
            Student student = studentBean.findStudent(studentId);
            List<Result> results = studentBean.getResultsByStudent(studentId);
            request.setAttribute("student", student);
            request.setAttribute("results", results);
            request.getRequestDispatcher("/student/view-result.jsp").forward(request, response);
        }
    }
}
