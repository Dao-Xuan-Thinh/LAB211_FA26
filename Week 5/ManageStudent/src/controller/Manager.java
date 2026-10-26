package controller;

import model.Student;
import model.StudentList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

import java.util.ArrayList;

public class Manager {
    StudentList SL = new StudentList();
    Menu Menu = new Menu();

    public void execute() {
        while (true) {
            int choice = Menu.showGet();

            switch (choice) {
                //Add
                case 1:
                    int count = 0;
                    while (true) {
                        System.out.print("Enter ID: ");
                        String id = DataInput.inputString();
                        if (SL.checkID(id)) {
                            System.out.println("ID Existed");
                            continue;
                        }
                        SL.addStudent(ConsoleForm.addStudent(id));
                        count++;

                        if (count >= 3 && !DataInput.inputYN("Do you want to contunue (Y/N)? >")) {
                            return;
                        }
                    }

                //Find and Sort
                case 2:
                    System.out.print("Enter Name to search: ");
                    ArrayList<Student> found = SL.findName(DataInput.inputName());
                    if(found.isEmpty()){
                        System.out.println("Student not found");
                        return;
                    }
                    SL.sortName(found);
                    ConsoleForm.showStudent(found);
                    break;

                //Update or Delete
                case 3:
                    updateOrDelete();
                    break;

                case 4:
                    ConsoleForm.showReport(SL.getReport());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }

    private void updateStudent(Student s) {
        while (true) {
            int choice = Menu.updateMenu();

            switch (choice) {
                case 1:
                    System.out.print("Enter new ID: ");
                    String id = DataInput.inputString();

                    boolean usedByAnother = SL.findID(id).stream()
                            .anyMatch(other -> other != s);

                    if (usedByAnother) {
                        System.out.println("ID already exists");
                    } else {
                        s.setId(id);
                    }
                    break;

                case 2:
                    System.out.print("Enter new name: ");
                    s.setName(DataInput.inputName());
                    break;

                case 3:
                    System.out.print("Enter new semester: ");
                    s.setSem(DataInput.inputString());
                    break;

                case 4:
                    System.out.print("Enter new course: ");
                    s.setCourse(DataInput.inputChoice("Java", ".Net", "C/C++"));
                    break;

                case 5:
                    return;
            }
        }
    }

    public void updateOrDelete(){
        System.out.print("Enter ID: ");
        String id = DataInput.inputString();

        ArrayList<Student> found = SL.findID(id);
        if (found.isEmpty()){
            System.out.println("Student not found");
            return;
        }

        ConsoleForm.showStudentFull(found);
        Student s = found.get(0);
        if (found.size() > 1){
            System.out.print("Choose entry: ");
            s = found.get(DataInput.inputIntInRange(1, found.size()) - 1);
        }

        System.out.print("Do you want to update (U) or delete (D) student: ");
        String choice = DataInput.inputChoice("U", "D");

        if (choice.equals("D")){
            SL.deleteStudent(s);
            System.out.println("Deleted");
        }
        else {
            updateStudent(s);
        }
    }
}
