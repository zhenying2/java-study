import java.awt.*;
public class LoginUIwithPanel1 extends Frame
{
	Label llg,lpw,lpress;
	TextField login, passwd;
	Button ok;
	Panel p1,p2,p3,border;

		public LoginUIwithPanel1(String msg){
			Frame f=new Frame(msg);

			llg=new Label("Login");
			lpw=new Label("Password");
			lpress=new Label("Press");
			login=new TextField(50);
			passwd=new TextField(50);
			passwd.setEchoChar('*');
			ok=new Button("OK");
			p1=new Panel();
			p2=new Panel();
			p3=new Panel();

			p1.add(llg);
			p1.add(login);
			p2.add(lpw);
			p2.add(passwd);
			p3.add(lpress);
			p3.add(ok);
			f.add("North",p1);
			f.add("Center",p2);
			f.add("South",p3);

			f.setSize(600,400);
			f.setVisible(true);
		}
}
