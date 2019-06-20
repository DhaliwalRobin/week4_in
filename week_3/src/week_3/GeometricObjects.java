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
public class GeometricObjects {
  private String color;
   private boolean filled;
   private java.util.Date dateCreated;
   public GeometricObjects(){}
   public GeometricObjects(String color, boolean filled){
       this.color=color;
       this.filled=filled;
   } 

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * @return the dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void setDate(){
            dateCreated=new java.util.Date(System.currentTimeMillis()); 
    }
   
    public String toString(){
    return "" ;
            }
   
}
