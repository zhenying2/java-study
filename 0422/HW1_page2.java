import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class HW1_page2 extends JFrame{
	JPanel panel;
	JLabel label;
	JButton button;
	Container container;
	ImageIcon icon, dog;
	HW1_page2(String msg){
		super("������ ���� �����Դϴ�!");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		label=new JLabel("������ ����~");
		dog = new ImageIcon("dog.gif");
		label.setIcon(dog);
		icon = new ImageIcon("icon.jpg");
		button = new JButton("Good luck!!!");
		button.setIcon(icon);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new HW1_page1("JButton �̺�Ʈtest:�������� ������");
			}
		});
		container.add(label);
		container.add(button);
		setVisible(true);
	}
	
}