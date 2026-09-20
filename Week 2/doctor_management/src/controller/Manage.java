package controller;

import model.DoctorList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

public class Manage {
    DoctorList DL = new DoctorList();
    ConsoleForm CF = new ConsoleForm();
    Menu menu = new Menu();

    public void execute(){
        while (true){
            int choice = menu.ShowAndGet();

            switch (choice) {
                case 1:
                    DL.addDoctor(CF.inputDoctor());
                    break;

                case 2:
                    String code = CF.inputCode();

                    if (DL.findByCode(code) == null) {
                        System.out.println("Doctor code does not exist");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String newName = DataInput.inputOptional();

                    System.out.print("Enter Specialization: ");
                    String newSpec = DataInput.inputOptional();

                    System.out.print("Enter Availability: ");
                    String newAvail = DataInput.inputOptionalInt();

                    DL.updateDoctor(code, newName, newSpec, newAvail);
                    break;

                case 3:
                    DL.deleteDoctor(CF.inputCode());
                    break;

                case 4:
                    CF.showAll(DL.getList());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
