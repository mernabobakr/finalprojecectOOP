package gr.teic.ie.oop2.paint;


import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This class inherits from MyPointsShape and is responsible for drawing a line.
 */
public class MyLine extends MyPointsShape {

    //private static int id;

    public MyLine() {
        super();
    
    }

    public MyLine(Point startPoint, Point endPoint, Color color) {
        super(new Point[]{startPoint, endPoint}, color);
       

      
    }

    /**
     * Mutator method for startPoint
     */
    public void setStartPoint(Point startPoint) {
        setPoints(new Point[]{startPoint, getPoints()[1]});
    }

    /**
     * Mutator method for endPoint
     */
    public void setEndPoint(Point endPoint) {
        setPoints(new Point[]{getPoints()[0], endPoint});
    }

    /**
     * Accessor method for y1
     */
    public Point getStartPoint() {
        return getPoints()[0];
    }

    public Point getEndPoint() {
        return getPoints()[1];
    }

    /**
     * Overrides the draw method in MyShape.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor()); //sets the color
        g.drawLine(getStartPoint().x, getStartPoint().y, getEndPoint().x, getEndPoint().y); //draws the line

       
    }
} // end class MyLine
