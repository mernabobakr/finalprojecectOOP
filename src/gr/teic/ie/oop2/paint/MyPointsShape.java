package gr.teic.ie.oop2.paint;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

abstract class MyPointsShape implements MyShape {

    private Point[] points;
    private Color color; // color of shape
    private String text = "";

    public MyPointsShape() {
        points = new Point[]{};
        color = Color.BLACK;
    }

    public MyPointsShape(Point[] points, Color color) {
        this.points = points;
        this.color = color;
    }

    //Mutator methods
    /**
     * Mutator method for points
     */
    public void setPoints(Point[] points) {
        this.points = points;
    }

    /**
     * Mutator method for color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Mutator method for text
     */
  
    //Accessor methods
    /**
     * Accessor method for points
     */
    public Point[] getPoints() {
        return points;
    }

    /**
     * Accessor method for color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Accessor method for text
     */
  
    /**
     * Abstract method for drawing the shape that must be overriden
     */
    abstract public void draw(Graphics g);

}
