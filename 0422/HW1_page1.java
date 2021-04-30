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
		super("JButton 이벤트test:진영이의 강아지");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		label=new JLabel("진영이의 강아지가 보고싶다면! 버튼을 누르세요 ->");
		icon = new ImageIcon("icon.jpg");
		button = new JButton("뚱이");
		button.setIcon(icon);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new HW1_page2("진영이 동생 뚱이입니다!");
			}
		});
		container.add(label);
		container.add(button);
		setVisible(true);
	}
}
