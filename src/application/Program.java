package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractShape s1 = new Circle(Color.WHITE, 2.0);
		AbstractShape s2 = new model.entities.Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
	}

}
