package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

List<Student> students = new ArrayList<>();
List<Course> courses = new ArrayList<>();

    Student student1 = new Student("Klara", "Suchan", "1");
    Student student2 = new Student("Felix", "Merker", "2");
    Student student3 = new Student("Noel", "Neumann", "3");
    Student student4 = new Student("Karl", "Frech", "4");


    public void addStudent(Student student) {
        students.add(student);
    }
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(String id) {

        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                return student;

            }
        }
        return null;

    }
    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                students.remove(student);
                break;
            }
        }
    }

    public String showCoursesByStudentId(String studentId) {
        Student s = findStudentById(studentId);
        return s.getCourses().toString();
    }
}
