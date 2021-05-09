import javax.swing.*;

public class LineShapes extends JFrame{
	public LineShapes(){
		setSize(600,500);
		setTitle("진영이의 Line Shapes 연습");
		JPanel panel=new MyShapePanel();
		add(panel);
		setVisible(true);
	}
}  

