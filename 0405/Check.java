import java.awt.*;

public class Check
{
	Checkbox check1, check2, check3;
	Checkbox freshman, sophomore, junior, senior;
	CheckboxGroup cbg;

	public Check(String msg){
		Frame f=new Frame(msg);
		f.setLayout(new FlowLayout());
		check1=new Checkbox("One");
		check2=new Checkbox("Two");
		check3=new Checkbox("Three");

		cbg=new CheckboxGroup();
		freshman=new Checkbox("1�г�", cbg,false);
		sophomore=new Checkbox("2�г�", cbg,true);
		junior=new Checkbox("3�г�", cbg,false);
		senior=new Checkbox("4�г�", cbg,false);

		f.add(check1);
		f.add(check2);
		f.add(check3);

		f.add(freshman);
		f.add(sophomore);
		f.add(junior);
		f.add(senior);

		f.setSize(400,400);
		f.setVisible(true);
	}
}  

