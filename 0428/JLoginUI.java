import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  JLoginUI extends JFrame implements ActionListener
{
	JPanel panel,panel1,panel2,panel3,panel4,panel5;
	JLabel main,login, password,press;
	JTextField logintext;
	JPasswordField passwordtext;
	JTextArea ect;
	JButton submit;

	public JLoginUI(){
		super("진영이의 홈페이지에 방문해주셔서 감사합니다.");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel=new JPanel();
		panel1=new JPanel();
		panel2=new JPanel();
		panel2.setLayout(new BorderLayout());
		panel3=new JPanel();
		panel3.setLayout(new BorderLayout());
		panel4=new JPanel();
		panel4.setLayout(new BorderLayout());
		panel5=new JPanel();
		submit=new JButton("OK");
		submit.addActionListener(this);

		login=new JLabel("ID");
		password=new JLabel("PW");
		logintext=new JTextField("",20);
		passwordtext=new JPasswordField("",20);
		ect=new JTextArea("",10,10);
		press=new JLabel("아래의 버튼을 누르세요.");
		ect.setVisible(false);
		panel.setBackground(Color.yellow);
		panel.add(login);
		panel.add(logintext);

		panel1.setBackground(Color.green);
		panel1.add(password);
		panel1.add(passwordtext);

		panel2.add(ect,BorderLayout.NORTH);
		panel2.add(press,BorderLayout.CENTER);
		panel2.add(submit,BorderLayout.SOUTH);

		panel3.add(panel,BorderLayout.NORTH);
		panel3.add(panel1,BorderLayout.CENTER);
		
		panel4.add(panel3,BorderLayout.NORTH);
		panel4.add(panel2,BorderLayout.CENTER);
		panel5.add(panel4);
		
		add(panel5);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
			ect.setVisible(true);
			ect.setText("로그인 되었습니다! \n");
			submit.setVisible(false);
			press.setVisible(false);
			logintext.setText("");
			passwordtext.setText("");
		}
}
