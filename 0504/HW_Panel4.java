import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class HW_Panel4 extends JPanel implements ActionListener{
	JLabel title4,l4;
	JButton button,button1,button2;
	Color color=new Color(255,0,0);
	Color color1=new Color(255,255,0);
	Color color2=new Color(0,128,0);
	Color color3=new Color(0,0,255);
	Color color4=new Color(255,255,255);
	String a,b,c;
	public HW_Panel4() {
		setLayout(null);
		//four판넬에는 눈사람을 각 요소별로 색을 다르게 하는 것을 표현해본다.
		title4=new JLabel("<진영이의 눈사람 색칠하기>");
		title4.setSize(500,20);
		title4.setLocation(300,30);
		add(title4);
		
		//안내문구
		l4=new JLabel("<html>-모자&목도리:&nbsp; <br><br>-몸통:&nbsp; <br><br>-장갑&단추:&nbsp; </html>");
		l4.setLocation(270,250);
		l4.setSize(250,250);
		add(l4);

		//색깔 바꾸는 버튼
		button=new JButton("모자와 목도리");
		button.setLocation(270,100);
		button.setSize(200,30);
		add(button);
		button.addActionListener(this);

		button1=new JButton("몸통");
		button1.setLocation(270,150);
		button1.setSize(200,30);
		add(button1);
		button1.addActionListener(this);

		button2=new JButton("장갑과 단추");
		button2.setLocation(270,200);
		button2.setSize(200,30);
		add(button2);
		button2.addActionListener(this);
	}

	public void paintComponent(Graphics g) 
	{
		//눈사람 몸통과 얼굴
		g.setColor(color1);
		g.fillOval(31,30,180,180);
		g.setColor(color1);
		g.fillOval(22,200,200,200);

		//눈사람 모자
		g.setColor(color);
		g.fillArc(70,10,120,80,-10,190);
		//모자방울 데코
		g.setColor(Color.PINK);
		g.fillArc(130,0,17,17,0,360);
		g.setColor(Color.BLACK);
		//왼쪽 눈을 그린다.
		g.fillOval(72,95,15,15);
		//오른쪽 눈을 그린다.
		g.fillOval(150,95,15,15);
		//입을 그린다.
		g.drawArc(85,120,70,50,180,180);
		//코를 그린다.
		g.setColor(Color.ORANGE);
		int[] xp=new int[] {120, 130, 80};
		int[] yp=new int[] {120, 140, 107};
		g.fillPolygon(xp,yp,3);
		
		//목도리 만들기
		g.setColor(color);
		g.fillArc(70,180,110,60,28,-228);
		g.fillRoundRect(140,210,40,100,20,20);

		//팔 그리기
		g.setColor(Color.BLACK);
		g.drawLine(8,210,78,250);
		g.drawLine(260,210,190,250);

		//장갑 그리기
		g.setColor(color2);
		g.fillArc(0,200,50,70,-28,170);
		g.fillArc(220,200,50,70,38,180);
		//몸통의 단추
		g.setColor(color2);
		g.fillOval(110,250,15,15);
		g.fillOval(110,300,15,15);
		g.fillOval(110,350,15,15);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		JButton k=(JButton)e.getSource();
		if (k.getText().equals("모자와 목도리")){
			l4.setText("<html>-모자&목도리:&nbsp; 완료!!! <br><br>-몸통:&nbsp; <br><br>-장갑&단추:&nbsp; </html>");
			color=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
			getParent().repaint();
		}
		if (k.getText().equals("몸통")){
			l4.setText("<html>-모자&목도리:&nbsp; <br><br>-몸통:&nbsp; 완료!!! <br><br>-장갑&단추:&nbsp; </html>");
			color1=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
			getParent().repaint();
		}
		if (k.getText().equals("장갑과 단추")){
			l4.setText("<html>-모자&목도리:&nbsp; <br><br>-몸통:&nbsp; <br><br>-장갑&단추:&nbsp; 완료!!!</html>");
			color2=new Color ((int) (Math.random()*255.0),(int) (Math.random()*255.0),(int) (Math.random()*255.0));
			getParent().repaint();
		}

	}
}
