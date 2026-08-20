package fr.fms.job;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Square;

public class TestIJob {
    public static void main(String[] args) {
        IJobImpl job = new IJobImpl();
        Circle c1 = new Circle(20, 30, 50); //rayon + x + y
        Point p = new Point( 100, 150);
        Circle c2 = new Circle (15,p);
        Square s1 = new Square (50, 200, 200); //cote + x + y
        Square s2 = new Square(65, 200, 50);
        Circle c3 = new Circle (30, 300, 300); //rayon + x + y

        job.addShape(1,c1);
        job.addShape(2,c2);
        job.addShape(3,s1);
        job.addShape(4,s2);
        job.addShape(5,c3);

        job.displayAll();
    }
}
