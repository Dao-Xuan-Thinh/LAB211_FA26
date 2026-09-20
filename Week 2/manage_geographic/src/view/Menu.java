package view;

import javax.xml.crypto.Data;

public class Menu {

    DataInput input = new DataInput();

    public int ShowAndGet(){
        System.out.println();
        System.out.println("""
    MENU
    ========================================================================
    1. Input the information of countries in East Asia
    2. Display the information of country you've just input
    3. Search the information of country by user-entered name
    4. Display the information of countries sorted name in ascending order
    5. Exit
    ========================================================================
    """);

        return input.GetIntInRange(">> ", 1, 5);
    }
}