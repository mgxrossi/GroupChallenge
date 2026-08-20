package fr.fms.job;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

public class IJobImpl implements IJob {

    private Map<Integer, Shape> shapes;

    public IJobImpl() {
        shapes = new HashMap<>();
    }

    @Override
    public void addShape(int id, Shape shape) {
        shapes.put(id, shape);
    }

    @Override
    public void deleteShape(int id) {
        shapes.remove(id);
    }

    @Override
    public Shape getShapeById(int id) {
        return shapes.get(id);
    }

    @Override
    public void moveShape(int id, int x, int y) {
        Shape shape = shapes.get(id);
        if (shape != null && shape.getCenter() != null) {
            shape.getCenter().setX(x);
            shape.getCenter().setY(y);
        }
    }

    @Override
    public void drawShape(Graphics g, Shape shape) {
    	if (shape instanceof Circle) {

            Circle c = (Circle) shape;
            Point p = c.getCenter();

            int r = (int) c.getRadius();

            g.fillOval(
                    p.getX(),
                    p.getY(),
                    2 * r,
                    2 * r
                );
            

        } else if (shape instanceof Square) {

            Square s = (Square) shape;
            Point p = s.getCenter();

            int side = (int) s.getSide();

            g.drawRect(
                p.getX(),
                p.getY(),
                side,
                side
            );
        }
    }

    public Set<Integer> getAllKeysShape(){
        return shapes.keySet();
    }

    @Override
    public void displayAll() {
        for (Shape s : shapes.values()) {
            System.out.println(s);
        }
    }
}