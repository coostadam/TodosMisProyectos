/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicio03;

/**
 *
 * @author dev
 */
public class Persona {

    private String code;
    private String name;
    private String surname;
    private double salary;

    public Persona(String code, String name, String surname, double salary) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Persona{" + "code=" + code + ", name=" + name + ", surname=" + surname + ", salary=" + salary + '}';
    }

    
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String personToCSV() {
        return this.code + "," + this.name + "," + this.surname + "," + this.salary;
    }
}
