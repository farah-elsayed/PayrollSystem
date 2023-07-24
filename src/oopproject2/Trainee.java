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
public class Trainee extends Employee{
    
    private String uni_name;
    private double GPA;
    private int academic_year;

    public Trainee() {
    }

    
    public Trainee(int ID, String name, int age, double salary, String uni_name, double GPA, int academic_year ) {
        super(ID, name, 1000, age);
        this.uni_name = uni_name;
        this.GPA = GPA;
        this.academic_year = academic_year;
    }

   

    public String getUni_name() {
        return uni_name;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

//    public double getSalary() {
//        return salary;
//    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

   

   
    
    
}
