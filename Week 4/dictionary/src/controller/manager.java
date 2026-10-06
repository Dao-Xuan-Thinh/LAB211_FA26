package controller;

import model.dictionary;
import view.consoleForm;
import view.menu;

public class manager {
    dictionary D = new dictionary();
    consoleForm CF = new consoleForm(D);
    menu menu = new menu();

    public void execute(){
        D.load();
        while(true){
            int choice = menu.showAndGet();

            switch (choice){
                case 1:
                    CF.add();
                    break;

                case 2:
                    CF.delete();
                    break;

                case 3:
                    CF.translate();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
