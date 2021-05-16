import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class ButtonEventType2 extends JPanel implements ActionListener{
	private int light_number=0;

	public ButtonEventType2(){
		setLayout(new BorderLayout());
		JButton b=new JButton("Traffic light");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100,100,100,100);
		g.drawOval(100,200,100,100);
		g.drawOval(100,300,100,100);
		
		if(light_number==0){
			g.setColor(Color.RED);
			g.fillOval(100,100,100,100);
		}else if (light_number==1){
			g.setColor(Color.GREEN);
			g.fillOval(100,200,100,100);
		}else{
			g.setColor(Color.YELLOW);
			g.fillOval(100,300,100,100);
		}
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		if (++light_number >=3)
			light_number=0;
		repaint();
	}
}
