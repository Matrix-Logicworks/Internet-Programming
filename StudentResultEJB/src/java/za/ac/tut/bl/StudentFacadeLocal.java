/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Result;
import za.ac.tut.entities.Student;

/**
 *
 * @author Dikot
 */
@Local
public interface StudentFacadeLocal {

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(String studentId);

    Student findStudent(String studentId);

    List<Student> getAllStudents();

    void addResult(Result result);

    void updateResult(Result result);

    void deleteResult(int resultId);

    List<Result> getResultsByStudent(String studentId);

}
