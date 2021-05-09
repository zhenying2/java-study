import javax.swing.*;

public class MoreShapes extends JFrame{
	public MoreShapes(){
		setSize(600,130);
		setTitle("진영이의 java 2D shape 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new MyShapePanel1();
		add(panel);
		setVisible(true);
	}
}  