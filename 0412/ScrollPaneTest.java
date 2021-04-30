import java.awt.*;
public class ScrollPaneTest
{
	ScrollPane sp;
	Panel mpanel, spanel;
	TextArea ta;
	Button ok, cancel;

	public ScrollPaneTest(){
		Frame f=new Frame("ScrollPane Test");

		sp=new ScrollPane();
		sp.setSize(150,100);

		mpanel=new Panel();
		mpanel.setSize(500,450);
		mpanel.setLayout(new BorderLayout());
		ta=new TextArea();
		mpanel.add("Center",ta);
		spanel=new Panel();
		ok=new Button("OK");
		cancel=new Button("CANCEL");
		spanel.add(ok);
		spanel.add(cancel);
		mpanel.add("South",spanel);

		sp.add(mpanel);
		f.add("Center",sp);
		f.setSize(200,200);
		f.setVisible(true);
	}
}
 