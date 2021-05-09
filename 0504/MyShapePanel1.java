import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class  MyShapePanel1 extends JPanel{
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();

	public MyShapePanel1(){
		Shape s;

		s=new Rectangle2D.Float(10,10,70,80);	//사각형
		shapeArray.add(s);
		s=new RoundRectangle2D.Float(110,10,70,80,20,20);	//둥근 사각형
		shapeArray.add(s);
		s=new Ellipse2D.Float(210,10,80,80);	//타원
		shapeArray.add(s);
		s=new Arc2D.Float(310,10,80,80,90,90, Arc2D.OPEN);	//원호: Arc2D.OPEN
		shapeArray.add(s);
		s=new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD);	//원호: Arc2D.CHORD
		shapeArray.add(s);
		s=new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE);	//원호: Arc2D.PIE
		shapeArray.add(s);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		for (Shape s: shapeArray) g2.draw(s);
	}
}
