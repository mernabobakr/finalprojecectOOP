package gr.teic.ie.oop2.paint;

import java.awt.Color;
import java.awt.Graphics;

public class BasicRectangle implements MyShape {
	
	private int x1, y1, x2, y2; //coordinates of shape
	private Color color=Color.BLACK; // color of shape
	
    public BasicRectangle() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        
      
    }

    public BasicRectangle(int x1, int y1, int x2, int y2,Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color=color;
       
    }
    
    
    public int getX1() {
        return x1;
    }

    /**
     * Accessor method for y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * Accessor method for x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * Accessor method for y2
     */
    public int getY2() {
        return y2;
    }
    
    public int getWidth() {
        return Math.abs(getX1() - getX2());
    }
    
    public int getUpperLeftX() {
        return Math.min(getX1(), getX2());
    }

    /**
     * gets the upper left y
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Mutator method for y1
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Mutator method for x2
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Mutator method for y2
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public int getUpperLeftY() {
        return Math.min(getY1(), getY2());
    }

    //Accessor methods
    /**
     * gets height
     */
    public int getHeight() {
        return Math.abs(getY1() - getY2());
    }
    
    public void draw(Graphics g) {
        g.setColor(color); //sets the color
       
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight()); //draws a regular rectangle
        
      
    }

}
