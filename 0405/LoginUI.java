import java.awt.*;

public class LoginUI
{
	public LoginUI(String msg){
		Frame f=new Frame(msg);
		f.setLayout(new FlowLayout());

		//UI ���� ���� ����
		Label llg, lpw, lnote;
		TextField login, passwd;
		TextArea note;

		//UI ���� Component ����
		llg=new Label("Login");
		lpw=new Label("Password");
		lnote=new Label("�ּ�");
		login=new TextField(50);
		passwd=new TextField(50);
		passwd.setEchoChar('*');
		note=new TextArea("�ּ��� �ټ���",20,50);

		//������ Component �߰�
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(lnote);
		f.add(note);

		f.setSize(500,400);
		f.setVisible(true);
	}
}  

