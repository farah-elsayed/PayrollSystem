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
public class Engineer extends Employee {
    private double workingHours;
  //  private double net_salary;
    Grade grade;

    public Engineer( int ID, String name, int age, double salary, String position, double WorkingHours) {
        super(ID, name, salary, age);
        this.workingHours = WorkingHours;
        grade = new Grade(position);
       
    }

    public Engineer() {
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

   
    
    
    
}
