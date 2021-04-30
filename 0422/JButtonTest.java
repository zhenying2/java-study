import javax.swing.*;
import java.awt.*; //gridlayout때문에 넣은코드

class JButtonTest 
{
	JButton plus,minus,mux, divide;

	public JButtonTest(String msg){
		JFrame jf=new JFrame(msg);
		jf.getContentPane().setLayout(new GridLayout(2,2));
		//디렉토리 다르게 설정할 경우 ex) ../images/~png 의 형식으로 쓰면 된다.
		ImageIcon iplus=new ImageIcon("plus.png");
		ImageIcon iminus=new ImageIcon("minus.png");
		ImageIcon imux=new ImageIcon("mux.png");
		ImageIcon idivide=new ImageIcon("divide.png");
		
		plus=new JButton(iplus);
		minus=new JButton(iminus);
		mux=new JButton(imux);
		divide=new JButton(idivide);
		
		jf.getContentPane().add(plus);
		jf.getContentPane().add(minus);
		jf.getContentPane().add(mux);
		jf.getContentPane().add(divide);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,480);
		jf.setVisible(true);
	}
}
