import java.awt.*;

class LabelTest 
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("LabelTest: Kim");
		Label lb=new Label("IT student Jinyoung");
		f.add(lb);
		f.setSize(400,150);
		f.setVisible(true);
	}
}
