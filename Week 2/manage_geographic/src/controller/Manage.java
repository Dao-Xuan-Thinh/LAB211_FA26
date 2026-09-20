package controller;

import model.EastAsiaCountryList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

public class Manage {
    EastAsiaCountryList eastAsiaCountryList = new EastAsiaCountryList();
    ConsoleForm CF = new ConsoleForm();
    Menu Menu = new Menu();

    public void execute() {
        while (true) {
            int choice = Menu.ShowAndGet();
            switch (choice) {
                case 1:
                    do{
                        eastAsiaCountryList.addInfomation(CF.inputInformation());
                    } while (DataInput.inputYN());
                    break;

                case 2:
                    CF.displayRecently(eastAsiaCountryList.GetLastestEntry());
                    break;

                case 3:
                    CF.displayList(eastAsiaCountryList.searchByName(CF.inputSearchName()));
                    break;

                case 4:
                    CF.displayList(eastAsiaCountryList.sortAscending());
                    break;

                case 5:
                System.exit(0);
            }
        }
    }
}
