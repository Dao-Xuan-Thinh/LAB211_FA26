package controller;

import model.EastAsiaCountryList;
import view.ConsoleForm;
import view.Menu;

public class Manage {
    EastAsiaCountryList eastAsiaCountryList = new EastAsiaCountryList();
    ConsoleForm CF = new ConsoleForm();
    Menu Menu = new Menu();

    public void execute() {
        while (true) {
            int choice = Menu.ShowAndGet();
            
        }
    }
}
