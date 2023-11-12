package GUISwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPane extends JFrame {

	public static void main(String[] args) {
		
		// JLayeredPane - Swing container that provides 
		//				  a third dimension for positioning components
		//				  ex. depth, z-index
		
		new LayeredPane();

	}
	
	public LayeredPane() {
		
		// NOTE! If you are not using a layout manager 
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components
		
		// --------- JLabel -----------
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 200, 200); // top, left, width, height
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100, 100, 200, 200); // top, left, width, height
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150, 150, 200, 200); // top, left, width, height
		
		
		// --------- JLayeredPane -----------
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500); // in this case, it takes all the frame
		layeredPane.add(label1, Integer.valueOf(0)); // placed the layer at the bottom
		layeredPane.add(label2, Integer.valueOf(1));
		layeredPane.add(label3, Integer.valueOf(2));
		
		// --------- JFrame -----------
		
		this.setSize(new Dimension(500, 500));
		this.setTitle("JLayeredPane");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null); // MAKE SURE THE setLayout IS SET TO NULL !!!
		this.add(layeredPane);
		
		this.setVisible(true);
		
	}

}
