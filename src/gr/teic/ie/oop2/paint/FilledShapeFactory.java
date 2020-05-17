package gr.teic.ie.oop2.paint;

import java.awt.Color;

public class FilledShapeFactory extends AbstractFactory {
	public MyShape getShape(String shapeType,int x1, int y1, int x2, int y2,Color color) {
		 if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new FilledRectangle(x1,y1,x2,y2,color);         
	      }else if(shapeType.equalsIgnoreCase("OVAL")){
	         return new FilledOval(x1,y1,x2,y2,color);
	      }	 
	      return null;
	   }

}
