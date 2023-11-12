package GUISwing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Demo extends JFrame {

	public static void main(String[] args) {

		// GridLAyout - places components in a grid of cells.
		// Each component takes all the available space in its cell
		// and all cells are of the same size

		new GridLayout_Demo();

	}

	public GridLayout_Demo() {
		
		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ---------- GridLayout Implementation Using Buttons ----------

		// --------- JFrame -----------

		this.setSize(500, 500);
		this.setTitle("GridLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new GridLayout(3, 3, 5, 5)); // rows, columns, horizontal margin, vertical margin

		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));

		this.setVisible(true);

	}

}
