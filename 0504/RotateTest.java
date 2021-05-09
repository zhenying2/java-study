import javax.swing.*;

class RotateTest extends JFrame {
	public RotateTest(){
		setSize(300,330);
		setTitle("진영이의 2D Rotate 연습");
		JPanel panel= new RotatePanel();
		add(panel);
		setVisible(true);
	}
}
