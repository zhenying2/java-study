import java.awt.*;

class FileDialogTest extends Frame
{
	FileDialog fd;
	public FileDialogTest(String title){
		super(title);
		fd=new FileDialog(this,"FileDialog");
		setSize(300,200);
		setVisible(true);
		fd.setVisible(true);
	}

	public static void main(String args[]){
		new FileDialogTest("DialogTest");
	}
}