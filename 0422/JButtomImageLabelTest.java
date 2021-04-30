import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //event처리를 위해 필요함
public class JButtomImageLabelTest implements ActionListener {
	JPanel panel;
	JLabel label;
	JButton button;
	public JButtomImageLabelTest(String msg) {
	JFrame jf = new JFrame(msg);
	jf.setTitle("JButton 이벤트test:진영이의 강아지");
	jf.setSize(300,250);
	panel = new JPanel();
	label = new JLabel("진영이의 강아지가 보고싶다면! 버튼을 누르세요 ->");
	button = new JButton("뚱이");
	ImageIcon icon = new ImageIcon("icon.gif");
	button.setIcon(icon);
	button.addActionListener(this);
	panel.add(label);
	panel.add(button);
	jf.add(panel);
	jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	ImageIcon dog = new ImageIcon("dog.jpg");
	label.setIcon(dog);
	label.setText("내동생 뚱이~");
	button.setText("Good Luck!!");
}
}