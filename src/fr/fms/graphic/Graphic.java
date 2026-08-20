package fr.fms.graphic;
import java.awt.Graphics;
import javax.swing.JFrame;

import fr.fms.entities.Shape;
import fr.fms.job.IJobImpl;

public class Graphic extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private IJobImpl job;
	
	public Graphic(IJobImpl job) {
		super("ChallengeShapes");
		
		this.job = job;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override
	public void paint(Graphics g) {	
		super.paint(g);
		
		for (int key: job.getAllKeysShape()) {

            Shape shape = job.getShapeById(key);
            
            //Test d'appel à la méthode drawShape;
            job.drawShape(g, shape);
		}
		
	}
}
