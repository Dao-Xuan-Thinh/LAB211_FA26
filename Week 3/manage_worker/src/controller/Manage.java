package controller;

import model.WorkerList;
import view.ConsoleForm;
import view.Menu;

public class Manage {
    WorkerList WL = new WorkerList();
    ConsoleForm CF = new ConsoleForm();
    Menu menu = new Menu();

    public void execute(){
        while (true){
            int choice = menu.ShowAndGet();

            switch (choice) {
                case 1:
                    WL.addWorker(CF.inputWorker());
                    break;

                case 2: {
                    String code = CF.inputCode();
                    double amount = CF.inputAmount();
                    if (WL.changeSalary("UP", code, amount)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Code not found");
                    }
                    break;
                }

                case 3: {
                    String code = CF.inputCode();
                    double amount = CF.inputAmount();
                    if (WL.changeSalary("DOWN", code, amount)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Code not found");
                    }
                    break;
                }

                case 4:
                    WL.displaySalary();
                    CF.showSalaryInfo(WL);
                    break;

                case 5:
                System.exit(0);
            }
        }
    }
}
