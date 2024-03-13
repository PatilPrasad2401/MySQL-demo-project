package com.prasad.model;

public class Bike {
    private int bikeId;
    private String make;
    private String model;
    private int year;
    private String colour;
    private String number_plate;

    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(String number_plate) {
        this.number_plate = number_plate;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", number_plate='" + number_plate + '\'' +
                '}';
    }
}