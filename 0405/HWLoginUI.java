import java.awt.*;

public class HWLoginUI
{
	//UI 관련 변수 선언
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;

	public HWLoginUI(String msg){
		Frame f=new Frame(msg);
		f.setLayout(new FlowLayout());

		//UI 관련 Component 생성
		llg=new Label("Login");
		lpw=new Label("Password");
		lpress=new Label("Press");
		login=new TextField(50);
		passwd=new TextField(50);
		passwd.setEchoChar('*');
		ok=new Button("OK");

		//생성된 Component 추가
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
