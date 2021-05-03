import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TableTest1 
{
	public TableTest1(String msg){
		JFrame jf=new JFrame(msg);

		String columnName[]={"이름","전화번호","E-Mail"};

		String data[][]={
			{"김진영","02-123-4567","jinyoung@aa.kr"},
			{"김진영2","010-1234-5678","jinyoung@bb.kr"},
			{"김진영3","010-9876-5432","jinyoung@cc.kr"}
		};

		JTable table=new JTable(data, columnName);
		JScrollPane sp=new JScrollPane(table);
		jf.getContentPane().add(sp,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisible(true);
	}
}
