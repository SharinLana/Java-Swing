package GUISwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_Demo extends JFrame {

	public static void main(String[] args) {

		// FlowLayout - places components in a row, sized at their preferred size.
		// If the horizontal space in the container is too small,
		// the FlowLayout wraps the components

		new FlowLayout_Demo();

	}

	public FlowLayout_Demo() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ---------- Flow Layout Implementation Using Buttons and a Panel ----------

		JPanel panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setPreferredSize(new Dimension(150, 350));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15)); // position + margin between items
		// FlowLayout can also be LEADING, TRALING, LEFT and RIGHT

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));

		// --------- JFrame -----------

		this.setSize(500, 500);
		this.setTitle("FlowLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 10)); // I used the BorderLayout here just to practice
		// But you can use FlowLayout here instead of the BorderLayout
		this.add(panel, BorderLayout.NORTH);

		this.setVisible(true);

	}

}
