import javax.swing.*;
import java.awt.*;
public class JLabelTest{
	JLabel label1, label2;

	public JLabelTest(String msg){
		JFrame jf=new JFrame(msg);
		jf.setTitle("Image Label Test");
		jf.setSize(300,250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.getContentPane().setBackground(Color.yellow);

		label1=new JLabel("University Logo");
		label1.setFont(new Font("±¼¸²Ã¼", Font.PLAIN,20));
		ImageIcon logo=new ImageIcon("sm_logo.gif");
		label2=new JLabel("SMU",logo,JLabel.CENTER);
		jf.getContentPane().add("North",label1);
		jf.getContentPane().add("Center",label2);
		jf.setVisible(true);
	}
}  
