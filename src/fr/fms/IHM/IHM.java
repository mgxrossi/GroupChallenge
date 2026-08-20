package fr.fms.IHM;

import fr.fms.entities.Circle;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;
import fr.fms.job.IJobImpl;

import java.awt.Graphics;
import javax.swing.JFrame;

public class IHM extends JFrame {
    private static final long serialVersionUID = 2L;
    private IJobImpl iJob; // Plus besoin de 'static' ici

    public IHM(IJobImpl iJob) {
        super("Voici nos formes géométriques !");
        this.iJob = iJob;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (iJob != null && iJob.getShapes() != null) {
            for (Shape shape : iJob.getShapes()) {
                if (shape instanceof Circle) {
                    drawShape(g, (Circle) shape);
                } else if (shape instanceof Square) {
                    drawShape(g, (Square) shape);
                }
            }
        }
    }

    public void drawShape(Graphics g, Circle circle) {
        if (circle.getCenter() != null) {
            g.drawOval(
                    circle.getCenter().getX(),
                    circle.getCenter().getY(),
                    (int) circle.getRadius() * 2,
                    (int) circle.getRadius() * 2
            );
        }
    }

    public void drawShape(Graphics g, Square square) {
        if (square.getCenter() != null) {
            g.drawRect(
                    square.getCenter().getX(),
                    square.getCenter().getY(),
                    (int) square.getSide(),
                    (int) square.getSide()
            );
        }
    }
}