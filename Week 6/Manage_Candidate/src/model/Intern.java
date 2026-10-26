package model;

public class Intern extends Candidate{
    protected String majors, semester, uniName;

    public Intern(){}

    public Intern(String id, String firstName, String lastName, String birthDate, String address, String phone, String mail, int type, String majors, String semester, String uniName) {
        super(id, firstName, lastName, birthDate, address, phone, mail, 2);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
}
