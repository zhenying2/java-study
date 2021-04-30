import javax.swing.JFrame;

class CheckBoxTestMain
{
	public static void main(String[] args)
		{
			JFrame frame=new JFrame("CheckBoxDemo");

			CheckBoxTest panel=new CheckBoxTest();

			panel.setOpaque(true);

			frame.add(panel);
			frame.setSize(800,800);
			frame.setVisible(true);
		}
}