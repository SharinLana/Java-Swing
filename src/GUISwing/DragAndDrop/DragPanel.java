package GUISwing.DragAndDrop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel {

	ImageIcon icon = new ImageIcon("happy.png");;
	final int WIDTH = icon.getIconWidth();
	final int HEIGHT = icon.getIconHeight();
	Point imageCorner;
	Point prevPt;

	DragPanel() {
		
		imageCorner = new Point(0, 0); // left, top
		
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		
		// Add listeners to the panel
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	
	}
	
	// This method will repaint the image after we move it to the new position
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		icon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY()); 

	}

	private class ClickListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint(); // updates the prevPt value to wherever we click
		}

	}
	
	// This class will move the image
	private class DragListener extends MouseMotionAdapter {
		
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			
			imageCorner.translate(
					(int)(currentPt.getX() - prevPt.getX()), // x position
					(int)(currentPt.getY() - prevPt.getY()) // y position
					);
			prevPt = currentPt;
			repaint();
		}

	}

}
