package com.example.hw15.model;

import java.util.Objects;

public class Employee {
    private String firstName;
    private  String LasteName;
    public Employee(String firstName, String lasteName){
        this.firstName = firstName;
        this.LasteName = lasteName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasteName(String lasteName) {
        LasteName = lasteName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLasteName() {
        return LasteName;
    }
    public String getFullName(){
        return (firstName + LasteName).toLowerCase();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(LasteName, employee.LasteName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, LasteName);
    }
}

