package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyBindings extends JFrame {

	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;

	public static void main(String[] args) {

		// Key Bindings - to bind an Action to a KeyStroke.
		// No need to click a component to give it focus.
		// All Swing components use Key Bindings.
		// Increased flexibility compared to KeyListeners
		// Can assign key strokes to individual Swing components
		// More difficult to utilize and set up...

		new KeyBindings();

	}

	KeyBindings() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ----------- JLabel ------------

		label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.pink);
		label.setBounds(0, 0, 100, 100); // left, top, width, height

		// ----------- Actions based on the custom classes ------------

		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		// Bind the element to the key strokes
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction"); // "UP" is a name for the up arrow on the keyboard and "upAction" is a title for this action
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction"); // single quotes if you use characters!
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction"); 
		label.getInputMap().put(KeyStroke.getKeyStroke('z'), "downAction"); 
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction"); 
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction"); 
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);

		// ----------- JFrame ------------

		this.setSize(500, 500);
		this.setTitle("Key Binding Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		this.add(label);

		this.setVisible(true);

	}

	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Set a new location to the label
			label.setLocation(label.getX(), label.getY() - 10); // x position, y position

		}

	}

	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Set a new location to the label
			label.setLocation(label.getX(), label.getY() + 10); // x position, y position

		}

	}

	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Set a new location to the label
			label.setLocation(label.getX() - 10, label.getY()); // x position, y position

		}

	}

	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Set a new location to the label
			label.setLocation(label.getX() + 10, label.getY()); // x position, y position

		}

	}

}
