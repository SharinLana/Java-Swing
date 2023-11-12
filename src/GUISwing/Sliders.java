package GUISwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders extends JFrame implements ChangeListener {

	JSlider slider;
	JPanel panel;
	JLabel temperature;

	public static void main(String[] args) {

		// JSlider - a GUI component that lets the user enter a value
		// by using an adjustable sliding knob on a track

		new Sliders();

	}

	public Sliders() {

		// NOTE! If you are not using a layout manager
		// (if the setLayout for the frame is set to null)
		// you have to use setBounds() for the components

		// ----------- JSlider ------------

		slider = new JSlider(0, 100, 50); // min, max, startingPoint

		slider.setPreferredSize(new Dimension(400, 200)); // width, height
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);

		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);

		slider.setPaintLabels(true); // adds numbers to the major ticks
		slider.setFont(new Font("MV Boli", Font.BOLD, 16));

		slider.setOrientation(SwingConstants.VERTICAL); // change the orientation of the slider to vertical

		slider.addChangeListener(this);

		// ----------- JLabel ------------

		temperature = new JLabel("°C = " + slider.getValue());
		temperature.setFont(new Font("MV Boli", Font.ITALIC, 20));

		// ----------- JPanel ------------

		panel = new JPanel();

		panel.setPreferredSize(new Dimension(420, 420));
		panel.add(slider);
		panel.add(temperature);

		// ----------- JFrame ------------

		this.setSize(450, 450);
		this.setTitle("Slider Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		this.add(panel);

		this.pack(); // the component will fill out the entire screen
		// but to make it work, you need to comment out the setBounds() and
		// setLayout(null)
		// and the add() method must be used BEFORE pack()
		this.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		temperature.setText("°C = " + slider.getValue());
	}

}
