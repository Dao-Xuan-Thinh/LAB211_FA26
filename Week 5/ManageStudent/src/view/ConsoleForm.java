package view;

import model.Report;
import model.Student;
import model.StudentList;

import java.util.ArrayList;

public class ConsoleForm {
    StudentList SL = new StudentList();

    public static Student addStudent(String id) {
        System.out.print("Enter Name: ");
        String name = DataInput.inputName();
        System.out.print("Enter Semester: ");
        String sem = DataInput.inputString();
        System.out.print("Enter Course: ");
        String course = DataInput.inputChoice("Java", ".Net", "C/C++");

        return new Student(id, name, sem, course);
    }

    public static void showStudent(ArrayList<Student> list){
        System.out.printf("%-10s%-25s%-10s%-10s%n", "ID", "Name", "Semester", "Course");
        for (Student s : list){
            System.out.printf("%-10s%-25s%-10s%-10s%n", s.getId(), s.getName(), s.getSem(), s.getCourse());
        }
    }

    public static void showStudentFull(ArrayList<Student> list){
        System.out.printf("%-5s%-10s%-25s%-10s%-10s%n", "No", "ID", "Name", "Semester", "Course");
        for (int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            System.out.printf("%-5d%-10s%-25s%-10s%-10s%n", i + 1, s.getId(), s.getName(), s.getSem(), s.getCourse());
        }
    }

    public static void showReport(ArrayList<Report> reports) {
        if (reports.isEmpty()) {
            System.out.println("No students to report");
            return;
        }

        System.out.printf("%-25s%-10s%-10s%n",
                "Student Name", "Course", "Total");

        for (Report r : reports) {
            System.out.printf("%-25s%-10s%-10d%n",
                    r.getName(), r.getCourse(), r.getTotal());
        }
    }

}