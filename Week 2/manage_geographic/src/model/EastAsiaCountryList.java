package model;

import java.util.ArrayList;
import java.util.Collections;

public class EastAsiaCountryList {
    private ArrayList<EastAsiaCountries> EA_ArrayList = new ArrayList<>();

    public ArrayList<EastAsiaCountries> getEA_ArrayList() {
        return EA_ArrayList;
    }

    public void addInfomation(EastAsiaCountries country) {
        EA_ArrayList.add(country);
    }

    public EastAsiaCountries GetLastestEntry() {
        if (!EA_ArrayList.isEmpty()){
            return EA_ArrayList.get(EA_ArrayList.size() - 1);
        }
        return null;
    }

    public ArrayList<EastAsiaCountries> searchByName(String name){
        name = name.toLowerCase();
        ArrayList<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries c: EA_ArrayList){
            if (c.getCountryName().toLowerCase().contains(name)){
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<EastAsiaCountries> sortAscending(){
        ArrayList<EastAsiaCountries> result = new ArrayList<>(EA_ArrayList);

        //Why is it black
        Collections.sort(result, (c1,c2) ->{
            return c1.getCountryName().compareTo(c2.getCountryName());
        });
        return result;
    }
}
