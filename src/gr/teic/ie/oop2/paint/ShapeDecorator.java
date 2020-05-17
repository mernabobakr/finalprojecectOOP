package gr.teic.ie.oop2.paint;

import java.awt.Graphics;

public abstract class ShapeDecorator implements MyShape {
	public MyShape shape;
	public ShapeDecorator(MyShape shape) {
		this.shape=shape;
	}
	public void draw(Graphics g) {
		this.shape.draw(g);

}
}
