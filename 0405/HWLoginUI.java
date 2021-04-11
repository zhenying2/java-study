import java.awt.*;

public class HWLoginUI
{
	//UI ���� ���� ����
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;

	public HWLoginUI(String msg){
		Frame f=new Frame(msg);
		f.setLayout(new FlowLayout());

		//UI ���� Component ����
		llg=new Label("Login");
		lpw=new Label("Password");
		lpress=new Label("Press");
		login=new TextField(50);
		passwd=new TextField(50);
		passwd.setEchoChar('*');
		ok=new Button("OK");

		//������ Component �߰�
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(lpress);
		f.add(ok);

		f.setSize(700,500);
		f.setVisible(true);
	}
}  
