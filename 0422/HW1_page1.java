import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HW1_page1 extends JFrame {
	JPanel panel;
	JLabel label;
	JButton button;
	Container container;
	ImageIcon icon;
	public HW1_page1(String msg) {
		super("JButton �̺�Ʈtest:�������� ������");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		label=new JLabel("�������� �������� ����ʹٸ�! ��ư�� �������� ->");
		icon = new ImageIcon("icon.jpg");
		button = new JButton("����");
		button.setIcon(icon);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new HW1_page2("������ ���� �����Դϴ�!");
			}
		});
		container.add(label);
		container.add(button);
		setVisible(true);
	}
}
