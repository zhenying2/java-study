import java.awt.*;
import java.awt.event.*;


public class TextEventTest extends Frame implements TextListener, ActionListener{
	TextArea edit;
	Button exit;
	Frame f;

	public TextEventTest(String msg){
		Frame f=new Frame(msg);
		edit=new TextArea();
		edit.addTextListener(this);
		exit=new Button("Exit");
		exit.addActionListener(this);

		add("Center",edit);
		add("South",exit);
		setSize(300,250);
		setVisible(true);
	}

	public void textValueChanged(TextEvent e){
		System.out.println("Text !");
	}

	public void actionPerformed(ActionEvent e){
		setVisible(false);
		dispose();
		System.exit(0);
	}
}  