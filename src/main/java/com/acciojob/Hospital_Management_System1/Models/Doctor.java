package com.acciojob.Hospital_Management_System1.Models;

public class Doctor {
    private Integer docId;

    private String name;

    private int age;

    private String degree;

    private String specialization;

    private String location;

    private int experience;

    public Doctor(Integer docId, String name, int age, String degree, String specialization, String location, int experience) {
        this.docId = docId;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.specialization = specialization;
        this.location = location;
        this.experience = experience;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
