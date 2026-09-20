package model;

public class Doctor {
    protected String code;
    protected String name;
    protected String spec;
    protected int availability;

    public Doctor(){}

    public Doctor(String code, String name, String spec, int availability){
        this.code = code;
        this.name = name;
        this.spec = spec;
        this.availability = availability;
    }

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

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString(){
        return String.format("%-20s%-20s%-20s%-20d", code, name, spec, availability);
    }
}
