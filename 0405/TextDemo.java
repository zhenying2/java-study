import java.awt.*;

public class TextDemo
{
	public TextDemo(){
		Frame f=new Frame("TextDemo");
		f.setLayout(new FlowLayout());

		TextArea text=new TextArea("Hello",5,30);
		f.add(text);

		char c='*';

		TextField field=new TextField(30);
		field.setEchoChar(c);
		f.add(field);

		f.setSize(300,200);
		f.setVisible(true);
	}
}  
