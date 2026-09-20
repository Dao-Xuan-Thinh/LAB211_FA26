package controller;

import model.ContactList;
import view.ConsoleForm;
import view.Menu;

public class Manage {
    ContactList CL = new ContactList();
    ConsoleForm CF = new ConsoleForm();
    Menu menu = new Menu();

    public void execute(){
        while(true) {
            int choice = menu.ShowAndGet();

            switch (choice){
                case 1:
                    CL.addContact(CF.inputContact());
                    break;

                case 2:
                    CF.showAll(CL.getList());
                    break;

                case 3:
                    CL.deleteContact(CF.inputIdToDel());
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
