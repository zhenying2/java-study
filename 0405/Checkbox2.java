import java.awt.*;

public class Checkbox2 extends Frame
{
	public Checkbox2(){
		super("CheckboxTest2");
		setLayout(new FlowLayout());

		Checkbox one=new Checkbox("One");
		Checkbox two=new Checkbox("Two");
		Checkbox three=new Checkbox("Three");
		
		add(one);
		add(two);
		add(three);
		setSize(300,200);
		setVisible(true);
	}
}