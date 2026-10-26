package controller;

import model.*;
import model.CandidateList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

public class Manage {
    CandidateList CL = new CandidateList();
    ConsoleForm CF = new ConsoleForm(CL);
    Menu Menu = new Menu();

    public void Execute(){
        while(true){
            int choice = Menu.showAndGet();

            switch (choice){
                case 1:
                    do {
                        CL.addCandidate(CF.inputCandidateType(new Experience()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 2:
                    do {
                        CL.addCandidate(CF.inputCandidateType(new Fresher()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 3:
                    do {
                        CL.addCandidate(CF.inputCandidateType(new Intern()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 4:
                    CF.searchCandidates(CL.getList());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
