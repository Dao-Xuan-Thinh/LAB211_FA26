package view;

import model.EastAsiaCountries;

import javax.xml.crypto.Data;

public class ConsoleForm {
    public EastAsiaCountries inputInformation() {
        EastAsiaCountries EA = new EastAsiaCountries();

        System.out.println("Enter code of the country");
        EA.setCountryName(DataInput.inputString());

        System.out.println("Enter name of the country");
        EA.setCountryName(DataInput.inputString());

        System.out.println("Enter Total Area");
        EA.setTotalArea(DataInput.inputPositiveFloat());

        System.out.println("Enter terrain of country");
        EA.setCountryTerrain(DataInput.inputString());

        return EA;
    }
}
