package view;

import model.*;

import java.time.Year;
import java.util.ArrayList;

public class ConsoleForm {
    public static String inputBirthDate() {
        return String.valueOf(DataInput.GetIntInRange("Birth year> ", 1900, Year.now().getValue()));
    }

    public static String inputPhone() {
        System.out.print("Phone> ");
        return DataInput.inputRegex("[0-9]{10,}", "Phone must contain at least 10 digits.");
    }

    public static String inputEmail() {
        System.out.print("Email> ");
        return DataInput.inputEmail();
    }

    public static int inputExpYear() {
        return DataInput.GetIntInRange("Year of Experience> ", 0, 100);
    }

    public static String inputRank() {
        System.out.print("Rank of Graduation> ");
        return DataInput.inputChoice("Excellence", "Good", "Fair", "Poor");
    }

    private static void inputCandidate(Candidate c) {
        System.out.print("ID> ");
        c.setId(DataInput.inputString());

        System.out.print("First name> ");
        c.setFirstName(DataInput.inputName());

        System.out.print("Last name> ");
        c.setLastName(DataInput.inputName());

        c.setBirthDate(inputBirthDate());

        System.out.print("Address> ");
        c.setAddress(DataInput.inputString());

        c.setPhone(inputPhone());
        c.setMail(inputEmail());
    }

    public static Experience inputCandidateType(Experience c) {
        inputCandidate(c);
        c.setType(0);

        c.setExpYear(inputExpYear());

        System.out.print("Professional skill> ");
        c.setProSkill(DataInput.inputString());

        return c;
    }

    public static Fresher inputCandidateType(Fresher c) {
        inputCandidate(c);
        c.setType(1);

        System.out.print("Graduation date> ");
        c.setGradDate(DataInput.inputString());

        c.setGradRank(inputRank());

        System.out.print("Education> ");
        c.setEducation(DataInput.inputString());

        return c;
    }

    public static Intern inputCandidateType(Intern c) {
        inputCandidate(c);
        c.setType(2);

        System.out.print("Majors> ");
        c.setMajors(DataInput.inputString());

        System.out.print("Semester> ");
        c.setSemester(DataInput.inputString());

        System.out.print("University name> ");
        c.setUniName(DataInput.inputString());

        return c;
    }

    private void displayCandidates() {
        String[] headings = {"EXPERIENCE CANDIDATE", "FRESHER CANDIDATE", "INTERN CANDIDATE"};

        for (int type = 0; type < headings.length; type++) {
            System.out.println("===== " + headings[type] + " =====");

            for (Candidate c : CandidateList.getList()) {
                if (c.getType() == type) {
                    System.out.println(c.getFirstName() + " " + c.getLastName());
                }
            }
        }
    }

    public void searchCandidates() {
        if (CandidateList.getList().isEmpty()){
            System.out.println("List is empty");
            return;
        }

        displayCandidates();

        System.out.print("Candidate name> ");
        String name = DataInput.inputString();

        int type = DataInput.GetIntInRange("Type> ", 0, 2);

        ArrayList<Candidate> found = CandidateList.findCandidate(name, type);

        if (found.isEmpty()) {
            System.out.println("No candidates found");
            return;
        }

        for (Candidate c : found) {
            System.out.println(c);
        }
    }
}
