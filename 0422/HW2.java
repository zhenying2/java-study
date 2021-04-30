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
		setTitle("HW2, 진영이의 커피주문!!");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		topPanel=new JPanel();
		JLabel label=new JLabel("진영, 어느 사이즈의 커피를 주문할거야?");
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
		text=new JLabel("아직 아무것도 주문하지 않았네요!");
		text.setForeground(Color.red);

		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()==small)
			text.setText("Small Size를 주문하였습니다.!");
		if (e.getSource()==medium)
			text.setText("Medium Size를 주문하였습니다.!");
		if (e.getSource()==large)
			text.setText("Large Size를 주문하였습니다.!");
	}
}
