import java.awt.*;

public class BorderTestTwo extends Frame
{
	public BorderTestTwo(){
		super("BorderTestTwo");
		setLayout(new BorderLayout(5,5));
		add(new Label("Hello World!!!!",Label.CENTER),BorderLayout.NORTH);
		add(new TextArea("Center",5,20),BorderLayout.CENTER);
		Panel panel=new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(new Button("OK"));
		panel.add(new Button("CANCEL"));
		add(panel, BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
}