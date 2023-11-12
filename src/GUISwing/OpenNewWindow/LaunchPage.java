package GUISwing.OpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	// 2. Create global variables
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");

	// 3. Create a constructor for this class
	public LaunchPage() {
		
		// -------- JButton --------
		myButton.setFocusable(false);
		myButton.setBounds(100, 160, 200, 40); // left, top, width. height
		myButton.addActionListener(this);
		
		// -------- JFrame ---------
		
		frame.setSize(420, 420);
		frame.setTitle("Launch Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // we will set the position of the element(s) manually, using setBounds()
		
		frame.add(myButton);
		
		frame.setVisible(true);
		
	}

	// 4. Create the button listener and call the NewWindow class
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == myButton) {
			frame.dispose(); // after clicking the button, the launch page will be deleted
			// this way we prevent clicking the button multiple times and opening many windows
			
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
