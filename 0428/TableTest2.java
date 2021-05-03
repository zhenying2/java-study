import javax.swing.*;
import java.awt.*;
public class TableTest2 extends JFrame
{
	JTable table1;
	JFrame jf;

	public TableTest2(String msg)
	{
		jf=new JFrame(msg);
		Object[][] data1={
			{"Yoon",new Integer(30),"Yoon@sm.ac.kr"},
			{"Lim",new Integer(40),"Lim@sm.ac.kr"},
			{"Park",new Integer(50),"Park@sm.ac.kr"},
			{"Lee",new Integer(60),"Lee@sm.ac.kr"},
		};

		String[] column={"Name","Age","E-mail"};
		table1=new JTable(data1, column);
		JScrollPane sp1=new JScrollPane(table1);
		jf.getContentPane().add(sp1,BorderLayout.CENTER);
		jf.setSize(300,200);
		jf.setVisible(true);
	}
}
