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


        //mathematik.teacher = professor;

        List<Student> students = new LinkedList<>();
        students.add(maximillia);

        //mathematik.students = students;

        mathematik.ausgabe();




        //#################################################################
        //###############################################################



        Course deutsch = new Course();


        List<Student> studentDeutsch = new LinkedList<>();

        Student s1 = new Student();
        s1.setFirstName("Betty");
        s1.setLastName("Musterfrau");
        s1.setStudentNumber("A2024123456");

        studentDeutsch.add(s1);

        Student s2 = new Student();
        s2.setFirstName("Frank");
        s2.setLastName("Bacon");
        s2.setStudentNumber("A2024123456");

        studentDeutsch.add(s2);

        deutsch.students = studentDeutsch;

        Professor p2 = new Professor();
        p2.setDegree("Dr.");
        p2.setFirstName("Albert");
        p2.setLastName("Einstein");

        deutsch.teacher = professor;

        Tutor t1 = new Tutor();
        t1.setFirstName("Asterix");
        t1.setLastName("Gallier");
        t1.setCourseToTeach("Deutsch");

        deutsch.tutor = t1;

        deutsch.ausgabe();

    }
}