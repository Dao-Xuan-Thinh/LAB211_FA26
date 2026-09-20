package model;

public class Contact {
    protected String fullName, firstName, lastName;
    protected String group;
    protected String address;
    protected String phone;
    protected int id;

    public Contact(){}

    public Contact(int id, String fullName, String firstName, String lastName, String group, String address, String phone){
        this.id = id; //Placeholder change this later
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("%-20d%-20s%-20s%-20s%-20s%-20s%-20s", id, fullName, firstName, lastName, group, address, phone);
    }
}
