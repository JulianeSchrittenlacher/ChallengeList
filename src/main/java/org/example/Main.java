package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//
        Student student1 = new Student("Klara", "Suchan", "1");
        Student student2 = new Student("Felix", "Merker", "2");
        Student student3 = new Student("Noel", "Neumann", "3");
        Student student4 = new Student("Karl", "Frech", "4");

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        System.out.println("All students:");
        school.printStudents();

        //Step 5
        System.out.println("\nStudent 1: ");
        System.out.println(school.findStudentById(student1.getStudentId()));

        //Step 6
        System.out.println("\nLösche student1 und zeige die Übrigen:");
        school.deleteStudent(student1.getStudentId());
        school.printStudents();

        System.out.println("\n");

        //Bonus Course

        Course courseEnglish = new Course("English", "Mr Tang", "a1");
        Course courseDeutsch = new Course("Deutsch", "Ms Wang", "a2");
        Course courseHistory = new Course("History", "Ms Hang", "a3");

        student3.setCourses(List.of(courseEnglish, courseDeutsch));
        student4.setCourses(List.of(courseEnglish, courseHistory));
        System.out.println("The Courses of " + student3 + "\n are:\n " +
                school.showCoursesByStudentId(student3.getStudentId()));
        System.out.println("\n");
        System.out.println("The Courses of " + student4 + "\n are:\n " +
                school.showCoursesByStudentId(student4.getStudentId()));









    }
}