package controller;

import model.*;
import model.CandidateList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

import java.io.Console;

public class Manage {
    CandidateList CL = new CandidateList();
    Menu Menu = new Menu();

    public void Execute(){
        while(true){
            int choice = Menu.showAndGet();

            switch (choice){
                case 1:
                    do {
                        CL.addCandidate(ConsoleForm.inputCandidateType(new Experience()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 2:
                    do {
                        CL.addCandidate(ConsoleForm.inputCandidateType(new Fresher()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 3:
                    do {
                        CL.addCandidate(ConsoleForm.inputCandidateType(new Intern()));
                        System.out.print("Do you want to continue (Y/N)? ");
                    } while (DataInput.inputYN());
                    break;

                case 4:
                    ConsoleForm.searchCandidates();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
