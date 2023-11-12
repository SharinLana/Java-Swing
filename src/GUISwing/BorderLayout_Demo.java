package GUISwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout_Demo extends JFrame {

	public static void main(String[] args) {

		// BorderLayout - places component in 5 areas: NORTH, SOUTH, EAST, WEST, CENTER
		// All extra space is placed in the center area
		// BorderLayout is a default layout manager for the JFrame
		// With it and without constraints, the component takes all the space it can
		// (the entire frame)

		new BorderLayout_Demo();
	}

	public BorderLayout_Demo() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ---------- Border Layout Implementation Using Panels ----------

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.yellow);

		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));

		// ------------ Sub panels for the panel5 --------------

		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

		panel6.setBackground(Color.black);
		panel7.setBackground(Color.gray);
		panel8.setBackground(Color.lightGray);
		panel9.setBackground(Color.darkGray);
		panel10.setBackground(Color.white);

		panel6.setPreferredSize(new Dimension(100, 100));
		panel7.setPreferredSize(new Dimension(100, 100));
		panel8.setPreferredSize(new Dimension(100, 100));
		panel9.setPreferredSize(new Dimension(100, 100));
		panel10.setPreferredSize(new Dimension(100, 100));

		// Adding the sub panels into the parent panel

		panel5.setLayout(new BorderLayout(20, 20)); // 20 and 20 is margins between the sub panels

		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.WEST);
		panel5.add(panel10, BorderLayout.CENTER);

		// --------- JFrame -----------

		this.setSize(700, 700);
		this.setTitle("Border Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 10)); // THIS IS IMPORTANT TO INCLUDE!!! 10 and 10 - margins between the
													// panels

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.SOUTH);
		this.add(panel3, BorderLayout.WEST);
		this.add(panel4, BorderLayout.EAST);
		this.add(panel5, BorderLayout.CENTER);

		this.setVisible(true);
	}

}
