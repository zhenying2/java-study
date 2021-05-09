import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class HW_Panel1 extends JPanel implements ActionListener{
	JLabel title1,l1;
	JButton button;
	Color color=new Color(255,0,0);
	Color color1=new Color(255,255,0);
	Color color2=new Color(0,128,0);
	Color color3=new Color(0,0,255);
	Color color4=new Color(255,255,255);

	public HW_Panel1() {
		setLayout(null);
		//one판넬에는 원형차트로 요일별 강의를 표현해본다.
		title1=new JLabel("<요일별로 진영이가 듣는 강의 개수에 대한 원형차트>");
		title1.setSize(500,20);
		title1.setLocation(100,10);
		add(title1);
		
		//안내문구
		l1=new JLabel("<html>&nbsp;월요일(수업 4개)<br>&nbsp;화요일(수업 2개)<br>&nbsp;수요일(수업 4개)<br>&nbsp;목요일(수업 2개)<br>&nbsp;금요일(수업 1개)</html>");
		l1.setLocation(40,40);
		l1.setSize(100,100);
		add(l1);

		//색깔 바꾸는 버튼
		button=new JButton("색깔을 바꿀건가요?");
		button.setLocation(40,380);
		button.setSize(200,30);
		add(button);
		button.addActionListener(this);
	}

	public void paintComponent(Graphics g) 
	{
		g.setColor(color);
		g.fillArc(150,150,200,200,0,-108);
		g.fillOval(30,50,7,7);

		g.setColor(color1);
		g.fillArc(150,150,200,200,-108,-60);
		g.fillOval(30,70,7,7);


		g.setColor(color2);
		g.fillArc(150,150,200,200,-168,-108);
		g.fillOval(30,90,7,7);


		g.setColor(color3);
		g.fillArc(150,150,200,200,-276,-60);
		g.fillOval(30,110,7,7);


		g.setColor(color4);
		g.fillArc(150,150,200,200,-336,-24);
		g.fillOval(30,130,7,7);
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
