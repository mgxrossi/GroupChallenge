package fr.fms.graphic;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Square;
import fr.fms.job.IJobImpl;

public class TestIhm {
	
	public static void main(String[] args) {

	    IJobImpl job = new IJobImpl();

	    Point p = new Point(100, 150);

	    job.addShape(1, new Circle(20, 30, 50));
	    job.addShape(2, new Circle(15, p));
	    job.addShape(3, new Square(50, 200, 200));
	    job.addShape(4, new Square(65, 200, 50));
	    job.addShape(5, new Circle(30, 300, 300));

	    new Graphic(job);	    
	}
}
