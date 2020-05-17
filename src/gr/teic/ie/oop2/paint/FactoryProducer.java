package gr.teic.ie.oop2.paint;

public class FactoryProducer {
	  public static AbstractFactory getFactory(boolean filled){   
	      if(filled){
	         return new FilledShapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	   }

}
