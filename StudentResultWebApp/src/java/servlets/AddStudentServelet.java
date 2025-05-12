/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Dikot
 */
@WebServlet(name = "AddStudentServelet", urlPatterns = {"/AddStudentServelet"})
public class AddStudentServelet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentBean;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Student stud = createStudent(studentId, name, email, password);
        studentBean.addStudent(stud);
        RequestDispatcher disp = request.getRequestDispatcher("admin/success.jsp");
        disp.forward(request, response);
        
    }
    
    private Student createStudent(String studentId, String name, String email, String password) {
        
        Student student = new Student();
        student.setStudentId(studentId);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        return student;
    }
}
