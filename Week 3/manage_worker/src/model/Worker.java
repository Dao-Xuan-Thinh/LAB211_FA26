package model;

import java.util.ArrayList;

public class Worker {
    protected String code;
    protected String name;
    protected String location;
    protected int age;
    protected double salary;

    private ArrayList<SalaryHistory> SL = new ArrayList<>();

    public Worker(){}

    public Worker(String code, String name, String location, int age, double salary){
        this.code = code;
        this.name = name;
        this.location = location;
        this.age = age;
        this.salary = salary;
    }

    public ArrayList<SalaryHistory> getSL(){
        return SL;
    }

    public void addSalary(SalaryHistory history){
        SL.add(history);
    }

    //Getters Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
