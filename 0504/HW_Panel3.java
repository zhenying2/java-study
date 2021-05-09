import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class HW_Panel3 extends JPanel implements ActionListener{
	JLabel title3,l3;
	JLabel m1,m2,m3,m4,m5;
	JLabel n1,n2,n3,n4,n5;
	JButton button;
	Color color=new Color(255,0,0);
	Color color1=new Color(0,0,255);

	public HW_Panel3() {
		setLayout(null);
		//three판넬에는 선형차트로 요일별 전공과 복수전공 강의를 표현해본다.
		title3=new JLabel("<요일별로 진영이가 듣는 본/부전공 강의 개수에 대한 막대차트>");
		title3.setSize(500,20);
		title3.setLocation(100,10);
		add(title3);
		
		//복전라벨
		m1=new JLabel("복전(1)");
		m2=new JLabel("복전(1)");
		m3=new JLabel("복전(1)");
		m4=new JLabel("복전(1)");
		m5=new JLabel("복전(1)");

		m1.setSize(80,10);
		m1.setLocation(110,264);
		add(m1);

		m2.setSize(80,10);
		m2.setLocation(172,264);
		add(m2);

		m3.setSize(80,10);
		m3.setLocation(244,264);
		add(m3);

		m4.setSize(80,10);
		m4.setLocation(306,264);
		add(m4);

		m5.setSize(80,10);
		m5.setLocation(354,264);
		add(m5);

		//본전라벨
		n1=new JLabel("본전(3)");
		n2=new JLabel("본전(1)");
		n3=new JLabel("본전(3)");
		n4=new JLabel("본전(1)");
		n5=new JLabel("본전(3)");

		n1.setSize(80,10);
		n1.setLocation(110,138);
		add(n1);

		n2.setSize(80,10);
		n2.setLocation(172,236);
		add(n2);

		n3.setSize(80,10);
		n3.setLocation(244,138);
		add(n3);

		n4.setSize(80,10);
		n4.setLocation(306,236);
		add(n4);

		n5.setSize(80,10);
		n5.setLocation(354,138);
		add(n5);

		//안내문구
		l3=new JLabel("<html>월 요일 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;화 요일 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;수 요일 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목 요일&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 금 요일</html>");
		l3.setLocation(116,270);
		l3.setSize(500,100);
		add(l3);

		//색깔 바꾸는 버튼
		button=new JButton("색깔을 바꿀건가요?");
		button.setLocation(320,40);
		button.setSize(150,30);
		add(button);
		button.addActionListener(this);
	}

	public void paintComponent(Graphics g) 
	{
		g.setColor(Color.BLACK);
		g.drawLine(90,90,90,300);
		g.drawLine(90,300,400,300);


		g.setColor(color);
		g.drawLine(110,250,375,250);
		g.fillOval(132,247,10,10);
		g.fillOval(194,247,10,10);
		g.fillOval(256,247,10,10);
		g.fillOval(318,247,10,10);
		g.fillOval(370,247,10,10);


		g.setColor(color1);
		g.drawLine(143,150,200,250);
		g.drawLine(200,250,258,150);
		g.drawLine(258,150,320,250);
		g.drawLine(320,250,367,150);

		g.fillOval(140,147,10,10);
		g.fillOval(257,147,10,10);
		g.fillOval(357,147,10,10);
		g.fillOval(192,247,10,10);
		g.fillOval(315,247,10,10);

	
	
	}

	public void actionPerformed(ActionEvent e){
		color=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		color1=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		getParent().repaint();
	}
}
