import javax.swing.*;

class GradientTest extends JFrame{
	public GradientTest(){
		setSize(300,330);
		setTitle("진영이의 java 2D Gradient Test");
		JPanel panel=new GradientPanel();
		add(panel);
		setVisible(true);
	}
}