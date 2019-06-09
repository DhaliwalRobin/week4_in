/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Robin
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    public HourlyEmployee(String fname,String lname,String ssn,double  hours,double wage){
        super(fname,lname,ssn);
        this.hours=hours;
        this.wage=wage;
    }

    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(float hours) {
        this.hours = hours;
    }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double earnings(){
        double earning=wage*hours;
        return earning;
    }
    public String toString(){
        return "the amount you earned this week is "+earnings();
    }
}
