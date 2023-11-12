package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListener_Demo extends JFrame implements KeyListener {

	JLabel label;
	ImageIcon icon;

	public static void main(String[] args) {

		// Keyboard listener

		new KeyListener_Demo();

	}

	public KeyListener_Demo() {

		// ----------- JLabel ------------

		label = new JLabel();
		label.setBounds(0, 0, 100, 120);
		label.setOpaque(true);
		label.setIcon(new ImageIcon("rocket.png"));

		// ----------- JFrame ------------

		this.setSize(500, 500);
		this.setTitle("Key Listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		this.addKeyListener(this); // add the KeyListener to the frame
		this.add(label);

		this.setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped - invoked when a key is typed.
		// Uses KeyChar, char - output

		// Move the label by using the following keys:

		switch (e.getKeyChar()) {
		// moving the label to the left
		case 'a':
			label.setLocation(label.getX() - 10, label.getY());
			break;
		// moving the label up
		case 'w':
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		// moving the label to the right
		case 's':
			label.setLocation(label.getX() + 10, label.getY());
			break;
		// moving the label down
		case 'z':
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		default:
			label.setLocation(label.getX(), label.getY());
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed - invoked when a physical key is pressed down.
		// Uses KeyCode, int - output

		// Move the label by using the following keys:

		switch (e.getKeyCode()) {
		// moving the label to the left using an arrow key code
		case 37:
			label.setLocation(label.getX() - 10, label.getY());
			break;
		// moving the label up using an arrow key code
		case 38:
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		// moving the label to the right using an arrow key code
		case 39:
			label.setLocation(label.getX() + 10, label.getY());
			break;
		// moving the label down using an arrow key code
		case 40:
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		default:
			label.setLocation(label.getX(), label.getY());
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyRelesed - invoked when a key is released

		System.out.println("You released a key char: " + e.getKeyChar());
		System.out.println("You released a key code: " + e.getKeyCode());

	}

}
