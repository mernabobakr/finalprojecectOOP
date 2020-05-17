package gr.teic.ie.oop2.paint;

import java.awt.Color;

public abstract class AbstractFactory {
	abstract MyShape getShape(String shapeType,int x1, int y1, int x2, int y2,Color color)  ;
}
