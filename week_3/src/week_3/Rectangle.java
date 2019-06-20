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
public class Rectangle extends GeometricObjects{
    private double width;
    private double height;
    
    public Rectangle(){}
    public Rectangle(double width, double height){
    this.width=width;
    this.height=height;
    }
    public Rectangle(double width, double height,String color,boolean filled){
    this.width=width;
    this.height=height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
    return width*height;
    }
    public double getPerimeter(){
    return 2*(width+height);
            }
    
}
