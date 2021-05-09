import javax.swing.*;

class TextureTest extends JFrame 
{
	public TextureTest(){
		setSize(800,800);
		setTitle("진영이의 2D Texture Rendering 연습");
		JPanel panel= new TexturePanel();
		add(panel);
		setVisible(true);
	}
}

