package org.example;

public class Person {

    private String name;
    private String lastName;
    private String ID;
    private String haircolor;
    private String eyeColor;


    public Person(){


    }

    public Person(String name, String lastName, String ID, String haircolor, String eyeColor) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.haircolor = haircolor;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
