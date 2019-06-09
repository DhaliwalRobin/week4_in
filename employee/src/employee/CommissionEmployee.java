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
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commisionRate;
    
    public CommissionEmployee(double grossSales,double commisionRate){
        super();
        this.grossSales=grossSales;
        this.commisionRate=commisionRate;
    }

    /**
     * @return the grossSales
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * @param grossSales the grossSales to set
     */
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    /**
     * @return the commisionRate
     */
    public double getCommisionRate() {
        return commisionRate;
    }

    /**
     * @param commisionRate the commisionRate to set
     */
    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }
    public double earnings(){
        double earning=commisionRate * grossSales;
        return earning;
    }
    @Override
    public String toString(){
        return "the total earning is ";
    }
}
