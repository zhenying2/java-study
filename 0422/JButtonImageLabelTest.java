import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //eventó���� ���� �ʿ���
public class JButtonImageLabelTest implements ActionListener {
	JPanel panel;
	JLabel label;
	JButton button;
	public JButtonImageLabelTest(String msg) {
		JFrame jf = new JFrame(msg);
		jf.setTitle("JButton �̺�Ʈtest:�������� ������");
		jf.setSize(300,250);
		panel = new JPanel();
		label = new JLabel("�������� �������� ����ʹٸ�! ��ư�� �������� ->");
		button = new JButton("����");
		ImageIcon icon = new ImageIcon("icon.jpg");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		jf.add(panel);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	ImageIcon dog = new ImageIcon("dog.gif");
	label.setIcon(dog);
	label.setText("������ ����~");
	button.setText("Good Luck!!");
}
}