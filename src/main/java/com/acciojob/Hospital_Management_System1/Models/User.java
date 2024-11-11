package com.acciojob.Hospital_Management_System1.Models;

public class User{
    private int userId;
    private String name;
    private int age;
    private int weight;
    private int shoeSize;
    private int waistSize;
    private int shirtSize;

    public User(){

    }

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public User(int userId, String name, int age, int weight, int shoeSize, int waistSize, int shirtSize) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.shoeSize = shoeSize;
        this.waistSize = waistSize;
        this.shirtSize = shirtSize;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    public void setShirtSize(int shirtSize) {
        this.shirtSize = shirtSize;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public int getWaistSize() {
        return waistSize;
    }

    public int getShirtSize() {
        return shirtSize;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", shoeSize=" + shoeSize +
                ", waistSize=" + waistSize +
                ", shirtSize=" + shirtSize +
                '}';
    }
}
