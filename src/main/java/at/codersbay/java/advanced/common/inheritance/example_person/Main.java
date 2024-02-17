package at.codersbay.java.advanced.common.inheritance.example_person;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        Person max = new Person();
        max.setFirstName("Max");
        max.setLastName("Mustermann");

        Student maximillia = new Student();
        maximillia.setFirstName("Maximillia");
        maximillia.setLastName("Musterfrau");
        maximillia.setStudentNumber("A2024123456");

        Tutor hans = new Tutor();
        hans.setFirstName("Hans");
        hans.setLastName("Mayer");
        hans.setStudentNumber("A20240987765");
        hans.setCourseToTeach("Mathematik");

        Professor professor = new Professor();
        professor.setFirstName("Martin");
        professor.setLastName("Berger");
        professor.setDegree("PhD");

        Course mathematik = new Course();
        mathematik.titel = "Mathematik für Beginner";
        mathematik.tutor = hans;
        mathematik.teacher = professor;

        List<Student> students = new LinkedList<>();
        students.add(maximillia);

        mathematik.students = students;

        mathematik.ausgabe();


    }
}