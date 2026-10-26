package model;

import java.util.ArrayList;
import java.util.Locale;

public class CandidateList {
    ArrayList<Candidate> CL = new ArrayList<>();

    public ArrayList<Candidate> getList(){
        return CL;
    }

    public void addCandidate(Candidate c){
        CL.add(c);
    }

    public ArrayList<Candidate> findCandidate(String name, int type) {
        ArrayList<Candidate> found = new ArrayList<>();
        String temp = name.trim().toLowerCase();

        for (Candidate c : CL) {
            if ((c.getFirstName().toLowerCase().contains(temp) || c.getLastName().toLowerCase().contains(temp)) && c.getType() == type) {
                found.add(c);
            }
        }
        return found;
    }

}
