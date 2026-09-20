package model;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> CL = new ArrayList<>();

    public ArrayList<Contact> getList(){
        return CL;
    }

                            //A bit clunky ? should rewrite this at some point but it works rn
    public Boolean addContact(Contact contactlink){
        contactlink.setId(nextId());
        contactlink.setFullName(contactlink.getFirstName() + " " + contactlink.getLastName());
        return CL.add(contactlink);
    }

                        //Can use List here because its more flexible i think (Update just dont use it)
    public boolean deleteContact(int id){
        for (Contact c : CL) {
            if (c.getId() == id) {
                this.CL.remove(c);
                System.out.println("Successful");
                return true;
            }
        }
        System.out.println("ID not found");
        return false;
    }
    //Merge find id with deleteContact because they are basically doing the same thing but with extra steps

    //Consoleform will do the printing, idk what this does tbh (update it does nothing)
    /*public void displayAll(ArrayList<Contact> list){
    }*/


    //if i delete the lastest contact (ID = 5) then the next contact get added will get (ID = 4(since 5 got deleted) + 1), 5 got reused, so this wont do
    private int lastID = 0;
    private int nextId(){
//        //If list is empty -> first id == 1
//        if (CL.isEmpty()) {
//            return 1;
//        }
//                    //Get last index
//        return CL.get(CL.size() - 1).getId() + 1;
        return ++lastID;      // i might actually be slow
    }
}
