/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

/**
 *
 * @author DELL
 */
public abstract class Employee {
    protected int ID;
    protected String name;
    protected double salary;
    protected int age;

    public Employee(int ID, String name, double salary, int age) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    
    
}
