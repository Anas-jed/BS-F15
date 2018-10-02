package com.example.arslan.bs_app.adapters;

public class StudentModel {

    private String name;
    private String rollNumber;

    public StudentModel() {
    }

    public StudentModel(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
