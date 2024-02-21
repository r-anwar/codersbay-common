package at.codersbay.java.advanced.common.inheritance.example_person;


import java.awt.*;
import java.util.List;

public class Course {

    String titel;

    List<Student> students;

    Tutor tutor;

    Professor teacher;

    public void ausgabe() {

        System.out.println("Titel: " + titel);

        if(tutor != null) {
            System.out.println("Tutor: " + tutor.getFirstName());
            System.out.println("Tutor: " + tutor.getLastName());
            System.out.println("Tutor: " + tutor.getStudentNumber());
            System.out.println("Tutor: " + tutor.getCourseToTeach());
        }

        if(teacher != null) {
            System.out.println("Teacher: " + teacher.getFirstName());
            System.out.println("Teacher: " + teacher.getLastName());
            System.out.println("Teacher: " + teacher.getDegree());
        }

        if (students != null) {
            System.out.println("Anzahl der StudentInnen: " + students.size());

            for (Student student : students) {
                System.out.println("StudentIn: " + student.getFirstName());
                System.out.println("StudentIn: " + student.getLastName());
                System.out.println("StudentIn: " + student.getStudentNumber());
            }
        }
    }
}
