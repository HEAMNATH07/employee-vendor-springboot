package com.ust.config;

public class Employeeinfo {
    public long id;//pk
    public String name;
    public int age;
    public String email;
    public int vendorid;//fk

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVendorid() {
        return vendorid;
    }

    public void setVendorid(int vendorid) {
        this.vendorid = vendorid;
    }

    public Employeeinfo(long id, String name, int age, String email, int vendorid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.vendorid = vendorid;
    }
}

