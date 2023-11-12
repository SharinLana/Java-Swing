package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListener_Demo extends JFrame implements MouseListener {

	ImageIcon annoyedIcon, surprisedIcon, sadIcon, happyIcon, laughigIcon;
	JLabel label;

	public static void main(String[] args) {

		//

		new MouseListener_Demo();

	}

	public MouseListener_Demo() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ----------- Icons ------------
		
		annoyedIcon = new ImageIcon("annoyed.png");
		surprisedIcon = new ImageIcon("surprised.png");
		sadIcon = new ImageIcon("sad.png");
		happyIcon = new ImageIcon("happiness.png");
		laughigIcon = new ImageIcon("happy.png");
		
		// ----------- JLabel ------------
		
		label = new JLabel();
		label.setOpaque(true);
		label.setPreferredSize(new Dimension(140, 140));
		label.setIcon(annoyedIcon);
		
		label.addMouseListener(this);
		
		// ----------- JFrame ------------
		
		this.setSize(450, 450);
		this.setTitle("Mouse Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(label);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invokes when the mouse button is pressed and then released
		System.out.println("You clicked the mouse!");
		
		label.setIcon(surprisedIcon);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invokes when the mouse button is pressed
		System.out.println("Pressed");
		
		label.setIcon(sadIcon);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invokes when the mouse button is released
		System.out.println("Released");
		
		label.setIcon(happyIcon);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Mouse in
		System.out.println("In");
		
		label.setIcon(laughigIcon);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Mouse out
		System.out.println("Out");
		
		label.setIcon(annoyedIcon);

	}

}
