import javax.swing.*;
import java.awt.event.*;

public class ColorTest extends JFrame{
	public ColorTest(){
		setSize(240,300);
		setTitle("진영이의 Color Test");
		JPanel panel=new ColorPanel();
		add(panel);
		setVisible(true);
	}
}  
