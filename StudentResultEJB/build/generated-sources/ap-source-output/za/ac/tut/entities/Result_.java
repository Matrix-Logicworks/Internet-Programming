package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T21:02:09")
@StaticMetamodel(Result.class)
public class Result_ { 

    public static volatile SingularAttribute<Result, Integer> resultId;
    public static volatile SingularAttribute<Result, Student> student;
    public static volatile SingularAttribute<Result, String> subject;
    public static volatile SingularAttribute<Result, String> grade;
    public static volatile SingularAttribute<Result, Integer> marks;

}