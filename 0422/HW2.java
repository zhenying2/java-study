import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class HW2 extends JFrame implements ActionListener{
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;

	public HW2(){
		setTitle("HW2, �������� Ŀ���ֹ�!!");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		topPanel=new JPanel();
		JLabel label=new JLabel("����, ��� �������� Ŀ�Ǹ� �ֹ��Ұž�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);

		sizePanel=new JPanel();
		small=new JRadioButton("Small Size");
		medium=new JRadioButton("Medium Size");
		large=new JRadioButton("Large Size");

		ButtonGroup size=new ButtonGroup();

		size.add(small);
		size.add(medium);
		size.add(large);

		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		add(sizePanel, BorderLayout.CENTER);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);

		resultPanel=new JPanel();
		text=new JLabel("���� �ƹ��͵� �ֹ����� �ʾҳ׿�!");
		text.setForeground(Color.red);

		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==small)
			text.setText("Small Size�� �ֹ��Ͽ����ϴ�.!");
		if (e.getSource()==medium)
			text.setText("Medium Size�� �ֹ��Ͽ����ϴ�.!");
		if (e.getSource()==large)
			text.setText("Large Size�� �ֹ��Ͽ����ϴ�.!");
	}
}
