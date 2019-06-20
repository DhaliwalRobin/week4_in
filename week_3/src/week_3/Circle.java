/*
 * Sandeep Rai
 * 991450576
 * 
 */
package week_3;

/**
 *
 * @author Sandeep
 */
public class Circle extends GeometricObjects {
    private double radius;
    
    public Circle(){
}
public Circle(double radius){
    this.radius=radius;
}
public Circle(double radius,String color,boolean filled){
   // super(color, filled);
    this.radius=radius;
}

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
    return radius*radius*3.14;
    }
    public double getPerimeter(){
    return 2*radius*3.14;
    }
    public double getDiameter(){
    return 2*radius;
    }
    
    public void printCircle(){
    System.out.println("");
    }
}