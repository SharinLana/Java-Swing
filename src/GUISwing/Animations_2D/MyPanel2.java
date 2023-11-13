package GUISwing.Animations_2D;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel2 extends JPanel implements ActionListener {

	Image enemy;
	Image backgroundImage;
	Timer timer;
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;

	MyPanel2() {
		enemy = new ImageIcon("sad.png").getImage();
		backgroundImage = new ImageIcon("bg.jpeg").getImage();
		timer = new Timer(10, this); // 10 = delay time: 10 ms., this = panel
		timer.start(); // the timer will start right after we instantiate the panel

		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT)); // since we use frame.pack() in MyFrame2
		this.setBackground(Color.black);
	}

	// This method will be invoked automatically.
	// No need to invoke it anywhere
	// Applications should not invoke the paint method directly,
	// but should instead use the repaint method to schedule the component for
	// redrawing.
	public void paint(Graphics g) {

		// To make the panel background visible, we should call the super class:
		super.paint(g); // this will display the panel background that we set in the constructor above

		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null); // image, x position, y position, observer
		g2D.drawImage(enemy, x, y, null); // image, x position, y position, observer
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Moving the image along the x axis:
		
		
		if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
			// flip the xVelocity from positive to a negative number
			// to change the direction to the opposite
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity; // every 10milliseconds the image will be moved by 1 pixel to the right

		
		// Moving the image along the y axis:
		
		if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
			// flip the xVelocity from positive to a negative number
			// to change the direction to the opposite
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity; // every 10milliseconds the image will be moved by 1 pixel to the right
		
		// TO MAKE THE IMAGE GO DIAGONAL, UNCOMMENT THE PIECE OF THE CODE FOR X AXIS
		
		// Applications should not invoke the paint method directly,
		// but should instead use the repaint method to schedule the component for
		// redrawing.
		repaint();

	}

}
