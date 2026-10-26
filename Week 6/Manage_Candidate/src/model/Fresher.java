package model;

public class Fresher extends Candidate{
    protected String gradDate, gradRank, education;

    public Fresher(){}

    public Fresher(String id, String firstName, String lastName, String birthDate, String address, String phone, String mail, int type, String gradDate, String gradRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, mail, 1);
        this.gradDate = gradDate;
        this.gradRank = gradRank;
        this.education = education;
    }

    public String getGradDate() {
        return gradDate;
    }

    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }

    public String getGradRank() {
        return gradRank;
    }

    public void setGradRank(String gradRank) {
        this.gradRank = gradRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
