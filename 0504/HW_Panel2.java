import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class HW_Panel2 extends JPanel implements ActionListener{
	JLabel title2,l2;
	JButton button;
	Color color=new Color(255,0,0);
	Color color1=new Color(255,255,0);
	Color color2=new Color(0,128,0);
	Color color3=new Color(0,0,255);
	Color color4=new Color(255,255,255);

	public HW_Panel2() {
		setLayout(null);
		//two판넬에는 막대차트로 요일별 강의를 표현해본다.
		title2=new JLabel("<요일별로 진영이가 듣는 강의 개수에 대한 막대차트>");
		title2.setSize(500,20);
		title2.setLocation(100,10);
		add(title2);
		
		//안내문구
		l2=new JLabel("<html>&nbsp;&nbsp;월(4)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;화(2)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;수(4)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목(2)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 금(1)</html>");
		l2.setLocation(150,270);
		l2.setSize(500,100);
		add(l2);

		//색깔 바꾸는 버튼
		button=new JButton("색깔을 바꿀건가요?");
		button.setLocation(300,40);
		button.setSize(150,30);
		add(button);
		button.addActionListener(this);
	}

	public void paintComponent(Graphics g) 
	{
		g.setColor(Color.BLACK);
		g.drawLine(90,90,90,300);
		g.drawLine(90,300,400,300);
		g.drawLine(84,250,96,250);
		g.drawLine(84,200,96,200);
		g.drawLine(84,150,96,150);
		g.drawLine(84,100,96,100);

		g.setColor(color);
		g.fillRect(160,100,20,200);


		g.setColor(color1);
		g.fillRect(200,200,20,100);


		g.setColor(color2);
		g.fillRect(250,100,20,200);



		g.setColor(color3);
		g.fillRect(296,200,20,100);
	


		g.setColor(color4);
		g.fillRect(340,250,20,50);
	
	}

	public void actionPerformed(ActionEvent e){
		color=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		color1=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		color2=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		color3=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		color4=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
		getParent().repaint();
	}
}
