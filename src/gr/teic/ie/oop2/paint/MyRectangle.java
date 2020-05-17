package gr.teic.ie.oop2.paint;


import java.awt.Color;

import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape {
    //private static int id;
    public MyRectangle() {
        super();
        
        
    }

    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(x1, y1, x2, y2, color, fill);
        

    }

    /**
     * Overrides the draw method in MyShape.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor()); //sets the color
        if (getFill()) //determines whether fill is true or false
        {
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight()); //draws a filled rectangle
        } else {
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight()); //draws a regular rectangle
        }

      
    }

}
