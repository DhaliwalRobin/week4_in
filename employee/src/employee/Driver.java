/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First name");
        String fname =sc.nextLine();
        System.out.println("Last name");
        String lname =sc.nextLine();
        System.out.println("Social security no.");
        String ssn =sc.nextLine();
        System.out.println("grossSale");
        int gs =sc.nextInt();
        System.out.println("Commission");
        int css =sc.nextInt();
        CommissionEmployee a=new CommissionEmployee(gs,css);
        double earnings = a.earnings();
        System.out.println(earnings);
        System.out.println(a);
        HourlyEmployee employee2 =new HourlyEmployee(fname,lname,ssn,gs,css);
        double earning2= employee2.earnings();
        System.out.println(earning2);
        System.out.println(employee2);
        
    }
}
