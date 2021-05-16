import javax.swing.JFrame;

public class MouseMoveEventMain{
	JFrame jf;

	public MouseMoveEventMain(String msg){
		jf=new JFrame(msg);
		jf.add(new MouseMoveEvent());
		jf.setSize(900,1000);
		jf.setVisible(true);
	}

	public static void main(String[] args){
		new MouseMoveEventMain("mousemove event ");
	}
}