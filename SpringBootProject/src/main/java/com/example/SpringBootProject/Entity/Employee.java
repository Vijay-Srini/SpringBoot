package com.example.SpringBootProject.Entity;

public class Employee {

    private Long id;
    private String name;
    private int age;
    private String responsibility;

    public Employee() {
    }

    public Employee(Long id, String name, int age, String responsibility) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.responsibility = responsibility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

}
