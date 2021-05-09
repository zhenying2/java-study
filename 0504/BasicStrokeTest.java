import javax.swing.*;

class BasicStrokeTest extends JFrame{
	public BasicStrokeTest(){
		setSize(300,330);
		setTitle("진영이의 2D BasicStroke 연습");
		JPanel panel=new BasicStrokePanel();
		add(panel);
		setVisible(true);
	}
}