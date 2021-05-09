import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class SnowManPanel1 extends JPanel {
	public SnowManPanel1(){
	}

	public void paintComponent(Graphics g) 
	{
		//눈사람 몸통과 얼굴
		g.setColor(Color.WHITE);
		g.fillOval(31,30,180,180);
		g.setColor(Color.WHITE);
		g.fillOval(22,200,200,200);

		//눈사람 모자
		g.setColor(Color.RED);
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
		g.setColor(Color.RED);
		g.fillArc(70,180,110,60,28,-228);
		g.fillRoundRect(140,210,40,100,20,20);

		//팔 그리기
		g.setColor(Color.BLACK);
		g.drawLine(8,210,78,250);
		g.drawLine(260,210,190,250);

		//장갑 그리기
		g.setColor(Color.PINK);
		g.fillArc(0,200,50,70,-28,170);
		g.fillArc(220,200,50,70,38,180);
		//몸통의 단추
		g.setColor(Color.PINK);
		g.fillOval(110,250,15,15);
		g.fillOval(110,300,15,15);
		g.fillOval(110,350,15,15);
	}
}
