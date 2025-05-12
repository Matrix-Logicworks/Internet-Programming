package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Result;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T21:02:09")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> studentId;
    public static volatile SingularAttribute<Student, String> password;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile ListAttribute<Student, Result> results;
    public static volatile SingularAttribute<Student, String> email;

}