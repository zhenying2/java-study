import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class HW_Panel5 extends JPanel
{
	JLabel colorLabel;
	JSlider[] sl=new JSlider[3]; 
	public HW_Panel5() {
		setLayout(new FlowLayout());

		colorLabel=new JLabel("RGB 값을 각각 위의 슬라이더를 통해 골라보세요!.");

		for (int i=0;i<sl.length ;i++ )
		{
			sl[i]=new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);

			sl[i].addChangeListener(new MyChangeListener());
			add(sl[i]);
		}

		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);

		int r=sl[0].getValue();
		int g=sl[1].getValue();
		int b=sl[2].getValue();

		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));

		add(colorLabel);
		setSize(300,200);
		setVisible(true);
		
	}

		class MyChangeListener implements ChangeListener
		{
			public void stateChanged(ChangeEvent e){
				int r=sl[0].getValue();
				int g=sl[1].getValue();
				int b=sl[2].getValue();
				colorLabel.setBackground(new Color(r,g,b));
				new HW_Panel5();
			}	
		}
}