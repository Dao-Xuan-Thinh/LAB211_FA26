package model;

import java.io.*;
import java.util.HashMap;
import view.dataInput;

public class dictionary {
    private HashMap<String, String> DL = new HashMap<>();
    private String file = "dictionary.txt";

    //file -> map
    public void load(){
        try (BufferedReader read = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = read.readLine()) != null){
                String[] temp = line.split("-");

                if (temp.length == 2){
                    String key = temp[0];
                    String value = temp[1];
                    DL.put(key, value);
                }
            }
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    //map -> file
    public void update(){
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file))){
            for(HashMap.Entry<String, String> entry : DL.entrySet()){
                write.write(entry.getKey() + "-" + entry.getValue());
                write.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }

    public boolean check(String key){
        for(HashMap.Entry<String, String> entry : DL.entrySet()){
            if (key.equals(entry.getKey())){
                return true;
            }
        }
        return false;
    }

    public boolean add(String key, String vaule) {
        if (check(key)) {
            if (dataInput.inputYN()) {
                DL.put(key, vaule);
                update();
                return true;
            } else
                return false;
        } else {
            DL.put(key, vaule);
            System.out.println("Successful");
            update();
            return true;
        }
    }

    public boolean remove(String key){
        if (check(key)){
            DL.remove(key);
            System.out.println("Successful");
            update();
            return true;
        }

        else {
            System.out.println("Unsuccessful");
            return false;
        }
    }

    public void translate(String key){
        if (check(key)){
            System.out.println("Vietnamese: " + DL.get(key));
        }
        else {
            System.out.println("Key not found");
        }
    }
}
