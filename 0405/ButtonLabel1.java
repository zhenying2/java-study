import java.awt.*;

public class ButtonLabel1 extends Frame
{
	Button ok;
	Label label;

	public ButtonLabel1(String msg){
		super(msg);
		setLayout(new FlowLayout());

		ok=new Button("OK");
		label= new Label("���� 1��° �Լ��� ���Դϴ�.");

		add(ok);
		add(label);

		setSize(300,200);
		setVisible(true);
	}
}  
