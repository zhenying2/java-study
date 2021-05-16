import javax.swing.*;
import java.awt.event.*;

class EventTestMyFrame5 extends JFrame {

	JButton button;
	JLabel label;

	public EventTestMyFrame5(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("event5 -lambda ");

		JPanel panel=new JPanel();
		button=new JButton("Button");
		label=new JLabel("Please, Click the Button");

		button.addActionListener(e->{
					label.setText("Clicked the Button");
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}
