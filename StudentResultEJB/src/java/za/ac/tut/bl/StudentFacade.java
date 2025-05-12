/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Result;
import za.ac.tut.entities.Student;

/**
 *
 * @author Dikot
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentResultEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public void addStudent(Student student) {
        em.persist(student);
    }

    @Override
    public void updateStudent(Student student) {
        em.merge(student);
    }

    @Override
    public void deleteStudent(String studentId) {
        Student student = em.find(Student.class, studentId);
        if (student != null) {
            em.remove(student);
        }
    }

    @Override
    public Student findStudent(String studentId) {
        Query query = em.createQuery("SELECT s FROM Student s WHERE s.studentId = :id", Student.class);
        query.setParameter("id", studentId);
        try {
            return (Student) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Student> getAllStudents() {
        Query query = em.createQuery("SELECT s FROM Student s", Student.class);
        return query.getResultList();
    }

    @Override
    public void addResult(Result result) {
        // Calculate grade based on marks
        int marks = result.getMarks();
        String grade = marks >= 80 ? "A" : marks >= 70 ? "B" : marks >= 60 ? "C" : marks >= 50 ? "D" : "F";
        result.setGrade(grade);
        em.persist(result);
    }

    @Override
    public void updateResult(Result result) {
        int marks = result.getMarks();
        String grade = marks >= 80 ? "A" : marks >= 70 ? "B" : marks >= 60 ? "C" : marks >= 50 ? "D" : "F";
        result.setGrade(grade);
        em.merge(result);
    }

    @Override
    public void deleteResult(int resultId) {
        Result result = em.find(Result.class, resultId);
        if (result != null) {
            em.remove(result);
        }
    }

    @Override
    public List<Result> getResultsByStudent(String studentId) {
        Query query = em.createQuery("SELECT r FROM Result r WHERE r.student.studentId = :id", Result.class);
        query.setParameter("id", studentId);
        return query.getResultList();
    }
}
