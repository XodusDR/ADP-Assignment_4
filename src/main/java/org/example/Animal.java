package org.example;

public class Animal {

    private String name;
    private int age;
    private String furColor;
    private String eyeColor;
    private String typeofAnimal;

    public Animal() {
    }

    public Animal(String name, int age, String furColor, String eyeColor, String typeOfAnimal) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.typeofAnimal = typeOfAnimal;
    }

    public String getTypeofAnimal() {
        return typeofAnimal;
    }

    public void setTypeofAnimal(String typeofAnimal) {
        this.typeofAnimal = typeofAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
