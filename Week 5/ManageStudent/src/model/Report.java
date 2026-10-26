package model;

public class Report {
    private String id, name, course;
    private int total;

    public Report(Student s) {
        id = s.getId();
        name = s.getName();
        course = s.getCourse();
        total = 1;
    }

    public boolean matches(Student s) {
        return id.equalsIgnoreCase(s.getId())
                && course.equalsIgnoreCase(s.getCourse());
    }

    public void increaseTotal() {
        total++;
    }

    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getTotal() { return total; }
}