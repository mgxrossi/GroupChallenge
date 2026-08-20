package fr.fms.job;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.fms.entities.Shape;

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
        if (shape != null) {
            shape.draw(g);
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