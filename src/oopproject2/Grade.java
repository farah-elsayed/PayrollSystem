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
public class Grade {
    private String position;
    private final double tax_rate;
    private final double pay_rate;
    private final int job_id;
    public Grade()
    {
        tax_rate = 0.0;
        pay_rate = 0.0;
        job_id = 0;
    }
    public Grade(String position) {
        this.position = position;
    if (position.equals("Manager"))
    {
       job_id=2022;
       tax_rate=0.06;
       pay_rate=200;
    }
     
    else if (position.equals("Team Leader"))
    {
        job_id=2021;
        tax_rate=0.04;
        pay_rate=140;
    }
    else if (position.equals("Team Member"))
    {
       job_id=2020;
       tax_rate=0.02;
       pay_rate=120;
     }
    else{
      job_id=0;
      tax_rate=0.0;
      pay_rate=0.0;
    }
    }
    public int getJob_id() {
        return job_id;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getTax_rate() {
        return tax_rate;
    }
    public double getPay_rate() {
        return pay_rate;
    }
 
   
}
    

