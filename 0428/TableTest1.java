import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TableTest1 
{
	public TableTest1(String msg){
		JFrame jf=new JFrame(msg);

		String columnName[]={"�̸�","��ȭ��ȣ","E-Mail"};

		String data[][]={
			{"������","02-123-4567","jinyoung@aa.kr"},
			{"������2","010-1234-5678","jinyoung@bb.kr"},
			{"������3","010-9876-5432","jinyoung@cc.kr"}
		};

		JTable table=new JTable(data, columnName);
		JScrollPane sp=new JScrollPane(table);
		jf.getContentPane().add(sp,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisible(true);
	}
}
