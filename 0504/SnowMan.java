import javax.swing.*;

public class  SnowMan{
	SnowMan(){
		JFrame f=new JFrame();
		f.setTitle("진영이의 눈사람");
		f.add(new SnowManPanel1());
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
