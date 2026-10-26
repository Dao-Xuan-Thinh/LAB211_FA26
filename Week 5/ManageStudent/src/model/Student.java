package model;

public class Student {
    String id, name, sem, course;
    //coucrse only has Java, .Net and C/C++

    public Student(){}

    public Student(String id, String name, String sem, String course){
        this.id = id;
        this.name = name;
        this.sem = sem;
        this.course = course;
    }


    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
