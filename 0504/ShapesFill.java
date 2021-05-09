import javax.swing.*;

class ShapesFill extends JFrame {
	public ShapesFill(){
		setSize(600,130);
		setTitle("진영이의 java 2d 색채우기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new ShapesFillPanel();
		add(panel);
		setVisible(true);
	}
}
