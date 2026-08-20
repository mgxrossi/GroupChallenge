package fr.fms.graphic;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;
import fr.fms.job.IJobImpl;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class TestIhm extends JFrame {
	
	private IJobImpl job;
	
	public TestIhm(IJobImpl job) {
		super("ChallengeShapes");	
		
		this.job = job;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override	//le rep�re x,y commence en haut � gauche (0,0)
	public void paint(Graphics g) {	
		super.paint(g);
		
		
		//C'est ici qu'on doit afficher nos valeurs 
		for (int id = 1; id <= 5; id++) {

            Shape shape = job.getShapeById(id);

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
		
		/*g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diam�tre)
		g.drawOval(150, 50, 45, 70);
		g.drawRect(50, 150, 50, 50);
		g.fillRect(150, 150, 70, 50);		
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
		g2d.fillRect(250, 50, 70, 50);		
		
		g2d.fillOval(250,150,55,55);	*/	
	}
	
	public static void main(String[] args) {

	    IJobImpl job = new IJobImpl();

	    Point p = new Point(100, 150);

	    job.addShape(1, new Circle(20, 30, 50));
	    job.addShape(2, new Circle(15, p));
	    job.addShape(3, new Square(50, 200, 200));
	    job.addShape(4, new Square(65, 200, 50));
	    job.addShape(5, new Circle(30, 300, 300));

	    new TestIhm(job);	    
	}
	
	
}
