/*
 * Sandeep Rai
 * 991450576
 * 
 */
package week_3;

import java.util.Scanner;

/**
 *
 * @author Sandeep
 */
public class Week_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int v=5;
        Circle c=new Circle(1,"red",true);
        displayObject(c);
        System.out.println(v);
//        Rectangle r= new Rectangle(1,2,"blue", false);
//        displayObject(r);
    }
    
    public static void displayObject(GeometricObjects a){
        a.setDate();
        System.out.println("created on"+a.getDateCreated()+" color is "+a.getColor());
    }

   
}
