package model;

public class Experience extends Candidate{
    protected int expYear;
    protected String proSkill;

    public Experience() {}

    public Experience(String id, String firstName, String lastName, String birthDate, String address, String phone, String mail, int type, String proSkill, int expYear) {
        super(id, firstName, lastName, birthDate, address, phone, mail, 0);
        this.proSkill = proSkill;
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
}
