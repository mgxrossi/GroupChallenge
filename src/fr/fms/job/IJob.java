package fr.fms.job;

import java.awt.Graphics;

import fr.fms.entities.Shape;

public interface IJob {
    public void addShape (int id, Shape shape); 
    public void deleteShape(int id);
    public Shape getShapeById(int id);
    public void moveShape (int id, int x, int y);
    public void drawShape(Graphics g, Shape shape);
    public void displayAll();

}