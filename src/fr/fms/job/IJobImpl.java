package fr.fms.job;

import java.util.ArrayList;
import fr.fms.IHM.IHM;
import fr.fms.entities.Shape;

public class IJobImpl implements IJob {

    private ArrayList<Shape> shapes;
    private IHM ihm;

    public IJobImpl() {
        shapes = new ArrayList<>();
        ihm = new IHM(this);
    }

    // Permet à l'IHM de lire les formes à dessiner
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void addShape(int id, Shape shape) {
        shapes.add(shape);
        ihm.repaint();
    }

    @Override
    public void deleteShape(int id) {
        shapes.remove(id);
        ihm.repaint();
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
            ihm.repaint();
        }
    }

    @Override
    public void displayAll() {
        ihm.repaint();
    }
}