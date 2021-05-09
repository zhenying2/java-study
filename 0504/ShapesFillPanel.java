import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;


class  ShapesFillPanel extends JPanel{
	public ShapesFillPanel(){}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(3));
		GradientPaint gp=new GradientPaint(0,10,Color.WHITE,0,70,Color.RED);
		
		g2.setPaint(Color.RED);
		g2.fill(new Rectangle2D.Float(10,10,70,80));	//사각형 색채우기
		
		g2.setPaint(gp);
		g2.fill(new RoundRectangle2D.Float(110,10,70,80,20,20));	//둥근 사각형 색채우기

		g2.setPaint(Color.RED);
		g2.fill(new Ellipse2D.Float(210,10,80,80)); //타원 색채우기

		g2.setPaint(gp);
		g2.fill(new Arc2D.Float(310,10,80,80,45,225, Arc2D.OPEN));	//원호: Arc2D.OPEN 색채우기

		g2.setPaint(Color.RED);
		g2.fill(new Arc2D.Float(410,10,80,80,45,225,Arc2D.CHORD));	//원호: Arc2D.CHORD 색채우기

		g2.setPaint(gp);
		g2.fill(new Arc2D.Float(510,10,80,80,45,225,Arc2D.PIE));		//원호: Arc2D.PIE 색채우기
	}
}
