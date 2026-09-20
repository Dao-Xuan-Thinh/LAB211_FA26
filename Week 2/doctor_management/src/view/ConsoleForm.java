package view;

import model.Doctor;

import java.util.ArrayList;

public class ConsoleForm {
    public Doctor inputDoctor(){
        Doctor DT = new Doctor();
        System.out.print("Enter Code: ");
        DT.setCode(DataInput.inputString());

        System.out.print("Enter Name: ");
        DT.setName(DataInput.inputString());

        System.out.print("Enter Specialization: ");
        DT.setSpec(DataInput.inputString());

        System.out.print("Enter Availability: ");
        DT.setAvailability(DataInput.inputPositiveInt());

        return DT;
    }

    //couldnt figure it out
    public String[] inputUpdateDoctor(){
        System.out.print("Enter Name: ");
        String name = DataInput.inputOptional();

        System.out.print("Enter Specialization: ");
        String spec = DataInput.inputOptional();

        System.out.print("Enter Availability: ");
        String avail = DataInput.inputOptionalInt();

        return new String[]{name, spec, avail};
    }

    public void showAll(ArrayList<Doctor> DL) {
        System.out.printf("%-20s%-20s%-20s%-20s%n", "Code", "Name", "Specialization", "Availability");
        for (Doctor d : DL){
            System.out.println(d.toString());
        }
    }

    public String inputCode(){
        System.out.print("Enter Code: ");
        return DataInput.inputString();
    }
}
