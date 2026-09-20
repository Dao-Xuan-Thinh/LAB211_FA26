package view;

import model.EastAsiaCountries;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class ConsoleForm {
    public EastAsiaCountries inputInformation() {
        EastAsiaCountries EA = new EastAsiaCountries();

        System.out.println("Enter code of the country");
        EA.setCountryCode(DataInput.inputString());

        System.out.println("Enter name of the country");
        EA.setCountryName(DataInput.inputString());

        System.out.println("Enter Total Area");
        EA.setTotalArea(DataInput.inputPositiveFloat());

        System.out.println("Enter terrain of country");
        EA.setCountryTerrain(DataInput.inputString());

        return EA;
    }

    public void displayRecently(EastAsiaCountries countries) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        System.out.printf(countries.toString() + "\n");
    }

    public String inputSearchName() {
        System.out.println("Enter the name you want to search for: ");
        String name = DataInput.inputString();
        return name;

    }

    public void displayList(ArrayList<EastAsiaCountries> eastAsiaCountryList) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries e : eastAsiaCountryList) {
            System.out.printf(e.toString() + "\n");
        }
    }
}
