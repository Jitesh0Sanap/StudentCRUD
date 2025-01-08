package com.crudoperation.springcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_detail")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false , unique = true)
    private String Email;

    @Column(nullable = false)
    private int age;

    private String city;

    public Student() {
    }

    public Student(String name, String email, int age, String city) {
        this.name = name;
        Email = email;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
