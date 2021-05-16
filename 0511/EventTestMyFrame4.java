import javax.swing.*;
import java.awt.event.*;

class EventTestMyFrame4 extends JFrame {

	JButton button;
	JLabel label;

	public EventTestMyFrame4(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("event4 -independent class");

		JPanel panel=new JPanel();
		button=new JButton("Button");
		label=new JLabel("Please, Click the Button");

		button.addActionListener(new EventTestMyListener(label));
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}
