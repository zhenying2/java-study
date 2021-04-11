import java.awt.*;

public class HWLoginUITest1
{
	Panel panel,panel1, panel2;

	public HWLoginUITest1(String msg){
		Frame f=new Frame(msg);

		//크기 고정을 위해 panel 추가
		panel=new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(new Label("Login"));
		panel.add(new TextField(50));
		f.add("North",panel);

		panel1=new Panel();
		panel1.setLayout(new FlowLayout());
		panel1.add(new Label("Password"));
		panel1.add(new TextField(50));
		f.add("Center",panel1);

		panel2=new Panel();
		panel2.setLayout(new FlowLayout());
		panel2.add(new Label("Press"));
		panel2.add(new Button("OK"));
		f.add("South",panel2);

		f.setSize(600,300);
		f.setVisible(true);
	}
}  
