package view;

import model.dictionary;

public class consoleForm {
    dictionary D;

    public consoleForm(dictionary D){
        this.D = D;
    }

    public void add(){
        System.out.print("Enter English: ");
        String temp = dataInput.inputString();
        System.out.print("Enter Vietnamese: ");
        D.add(temp, dataInput.inputString());
    }

    public void delete(){
        System.out.println("Enter English: ");
        D.remove(dataInput.inputString());
    }

    public void translate(){
        System.out.println("Enter English: ");
        D.translate(dataInput.inputString());
    }
}
