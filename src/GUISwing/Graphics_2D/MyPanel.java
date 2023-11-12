package GUISwing.Graphics_2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Image image;
	
	MyPanel() {
		image = new ImageIcon("annoyed.png").getImage(); // getImage() will create the Image out of the ImageIcon
 		
		this.setPreferredSize(new Dimension(400, 400));
		
	}
	
	// This method will be invoked automatically.
		// No need to invoke it anywhere
		public void paint(Graphics g) {
			// Graphics2D is a child class of the Graphics g object
			
			Graphics2D g2D = (Graphics2D) g;
			
			g2D.setPaint(Color.blue); // sets the color to the stroke
			g2D.setStroke(new BasicStroke(5)); // sets the stroke width to 5px
			g2D.drawLine(0, 0, 400, 400); // starting x and y positions, ending x and y positions
			
			g2D.setPaint(Color.green);
			g2D.fillRect(0, 0, 100, 200); // fills the rectangle with the color
			
			g2D.setPaint(Color.black);
			g2D.drawRect(160, 160, 100, 200); // draws a rectangle (left, top, width, height
			
			g2D.setPaint(Color.orange);
			g2D.drawOval(80,  130,  100,  100);
			
			g2D.setPaint(Color.orange);
			g2D.fillOval(130, 10, 100, 120);
			g2D.drawOval(80,  130,  100,  100);
			
			// Drawing a complex figure using arc
			
			g2D.setPaint(Color.red);
			g2D.fillArc(0, 220, 100, 100, 0, 180); // left, top, width, height, position, angle
			g2D.setPaint(Color.white);
			g2D.fillArc(0, 220, 100, 100, 180, 180);
			
			// Drawing a polygon
			
			// Positions of the angles
			int[] xPoints = {220, 220, 360}; // 1st angle: left, 2nd angle left, 3rd angle left
			int[] yPoints = {20, 60, 60}; // 1st angle: top, 2nd angle top, 3rd angle top
			
			g2D.setPaint(Color.yellow);
			g2D.drawPolygon(xPoints, yPoints, 3);
			
			// Drawing a string
			
			g2D.setPaint(Color.magenta);
			g2D.setFont(new Font("Times New Roman", Font.BOLD, 20));
			g2D.drawString("You are a WINNER!", 200, 140); // stringText, x(left), y (top)
			
			// Inserting an icon
			
			g2D.drawImage(image, 270, 170, null); // image, coordinates, imageObserver
		}
}
