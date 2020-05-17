package gr.teic.ie.oop2.paint;


import java.awt.Color;

import java.awt.Graphics;

/**
 * This class inherits from MyBoundedShape and is responsible for drawing a
 * oval.
 */
public class MyOval extends MyBoundedShape {
    //private static int id;
    public MyOval() {
        super();
        
        //Logging
       
    }

    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(x1, y1, x2, y2, color, fill);
     
        //Logging
       
    }

    /**
     * Overrides the draw method in MyShape.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor()); //sets the color
        if (getFill()) //determines whether fill is true or false
        {
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight()); //draws a filled oval
        } else {
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight()); //draws a regular oval
        }

     
    }

} // end class MyOval
