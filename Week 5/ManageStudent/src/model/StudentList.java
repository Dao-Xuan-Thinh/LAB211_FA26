package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private final ArrayList<Student> SL = new ArrayList<>();

    public ArrayList<Student> getList(){
        return SL;
    }

    //check if the id existed or nah
    public Boolean checkID(String id){
        for(Student s : SL){
            if (s.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    //find by name
    public ArrayList<Student> findName(String name){
        ArrayList<Student> found = new ArrayList<>();
        for(Student s : SL){
            if(s.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(s);
            }
        }
        return found;
    }

    //find by id
    public ArrayList<Student> findID(String id){
        ArrayList<Student> found = new ArrayList<>();
        for(Student s : SL){
            if(s.getId().equalsIgnoreCase(id)){
                found.add(s);
            }
        }
        return found;
    }

    //sort by names
    public void sortName(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }

    public Boolean addStudent(Student StudentLink){
        if(checkID(StudentLink.getId())){
            return false;
        }
        SL.add(StudentLink);
        return true;
    }

    public void deleteStudent(Student StudentLink){
        SL.remove(StudentLink);
    }

    public ArrayList<Report> getReport() {
        ArrayList<Report> reports = new ArrayList<>();

        for (Student s : SL) {
            Report match = null;

            for (Report r : reports) {
                if (r.matches(s)) {
                    match = r;
                    break;
                }
            }

            if (match == null) {
                reports.add(new Report(s));
            } else {
                match.increaseTotal();
            }
        }

        return reports;
    }
}
