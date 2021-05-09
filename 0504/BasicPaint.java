import javax.swing.*;

public class BasicPaint{
	BasicPaint(String msg){
		JFrame f= new JFrame(msg);
		f.add(new MyPanel()); //MyPanel이라는 클래스 및 생성자 호출
		f.setSize(300,200);
		f.setVisible(true);
	}
}  



