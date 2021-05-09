import javax.swing.*;

public class  SnowManFace{
	SnowManFace(){
		JFrame f=new JFrame();
		f.setTitle("진영이의 눈사람 얼굴");
		f.add(new SnowManPanel());
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	SnowManFace(String msg){
		JFrame f=new JFrame();
		f.setTitle(msg);
		f.add(new SnowManPanel());
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
