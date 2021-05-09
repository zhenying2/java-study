import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class SnowManPanel extends JPanel {
	public SnowManPanel(){
	}

	public void paintComponent(Graphics g) 
	{
		g.setColor(Color.PINK);
		g.fillOval(20,30,200,200);
		g.setColor(Color.BLACK);

		//왼쪽 눈을 그린다.
		g.drawArc(50,80,50,50,180,-180);
		//오른쪽 눈을 그린다.
		g.drawArc(140,80,50,50,180,-180);
		//입을 그린다.
		g.drawArc(70,130,100,70,180,180);
	}
}
