import java.awt.*;
import javax.swing.*;

class InnerFrameTest2 
{
	JDesktopPane desktop;
	JInternalFrame inframe, inframe2;
	JButton ok;

	public InnerFrameTest2(String msg) 
	{
		JFrame jf=new JFrame(msg);
		desktop=new JDesktopPane();
		inframe=new JInternalFrame("Inner Frame1",true,true,false,false);
		ok=new JButton("ok");
		inframe.getContentPane().add(ok,BorderLayout.SOUTH);
		inframe.setSize(200,100);
		inframe.setVisible(true);
		
		inframe2=new JInternalFrame("Inner Frame2", true,true,false,false);
		JPanel jp=new JPanel();
		ImageIcon logo=new ImageIcon("../image/"+"sm_logo.gif");
		JButton icon=new JButton(logo);
		jp.add(icon);
		inframe2.getContentPane().add(jp,BorderLayout.SOUTH);
		inframe2.setSize(400,300);
		inframe2.setVisible(true);

		desktop.add(inframe);
		desktop.add(inframe2);
		jf.getContentPane().add(desktop,BorderLayout.CENTER);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(600,400);
		jf.setVisible(true);
	}
}
