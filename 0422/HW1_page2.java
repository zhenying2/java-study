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
		super("진영이 동생 뚱이입니다!");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		label=new JLabel("내동생 뚱이~");
		dog = new ImageIcon("dog.gif");
		label.setIcon(dog);
		icon = new ImageIcon("icon.jpg");
		button = new JButton("Good luck!!!");
		button.setIcon(icon);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new HW1_page1("JButton 이벤트test:진영이의 강아지");
			}
		});
		container.add(label);
		container.add(button);
		setVisible(true);
	}
	
}