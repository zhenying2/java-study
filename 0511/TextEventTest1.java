import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextEventTest1 implements TextListener, ActionListener{
	TextArea edit;
	JButton exit;
	JFrame f;

	public TextEventTest1(String msg){
		f=new JFrame(msg);
		edit=new TextArea();
		edit.addTextListener(this);
		exit=new JButton("Exit");
		exit.addActionListener(this);

		f.add("Center",edit);
		f.add("South",exit);
		f.setSize(300,250);
		f.setVisible(true);
	}

	public void textValueChanged(TextEvent e){
		System.out.println("Text !");
	}

	public void actionPerformed(ActionEvent e){
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	}
}  
