package model;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country(){}

    public Country(String countryCode, String countryName, float totalArea){
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString(){
        return String.format("%-20s%-20s%-20.1f", countryCode,countryName,totalArea);
    }
}
