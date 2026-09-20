package view;

import model.Contact;

import java.util.ArrayList;

public class ConsoleForm {
    public Contact inputContact(){
        Contact CT = new Contact();

        System.out.print("Enter First Name: ");
        CT.setFirstName(DataInput.inputString());

        System.out.print("Enter Last Name: ");
        CT.setLastName(DataInput.inputString());

        System.out.print("Enter Group: ");
        CT.setGroup(DataInput.inputString());

        System.out.print("Enter Address: ");
        CT.setAddress(DataInput.inputString());

        System.out.print("Enter Phone: ");
        CT.setPhone(DataInput.inputPhone());

        return CT;
    }

    public void showAll(ArrayList<Contact> CL) {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "FullName", "FirstName", "LastName", "Group", "Address", "Phone");
        for (Contact c : CL) {
            System.out.println(c.toString());
        }
    }

    public int inputIdToDel(){
        System.out.println("Enter ID: ");
        return DataInput.inputPositiveInt();
    }
}
