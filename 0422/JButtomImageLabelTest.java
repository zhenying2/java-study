import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //eventó���� ���� �ʿ���
public class JButtomImageLabelTest implements ActionListener {
	JPanel panel;
	JLabel label;
	JButton button;
	public JButtomImageLabelTest(String msg) {
	JFrame jf = new JFrame(msg);
	jf.setTitle("JButton �̺�Ʈtest:�������� ������");
	jf.setSize(300,250);
	panel = new JPanel();
	label = new JLabel("�������� �������� ����ʹٸ�! ��ư�� �������� ->");
	button = new JButton("����");
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
	label.setText("������ ����~");
	button.setText("Good Luck!!");
}
}