import javax.swing.*;
import java.awt.event.*;

class  DialogCall extends JFrame
{
	MyDialog dialog;
	JButton btn;

	public DialogCall() 
	{
		super("진영이의 JDialog 연습");
		
		btn=new JButton("Show Dialog!!!");
		dialog=new MyDialog(this, "Test Dialog");

		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dialog.setVisible(true);
			}
		});

		getContentPane().add(btn);
		setSize(300,300);
		setVisible(true);
	}
}
