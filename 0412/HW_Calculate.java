import java.awt.*;

public class HW_Calculate extends Frame
{
	Panel p1;
	TextArea tf;
	GridBagLayout gridbag;
	public HW_Calculate(){
		super("calculater");

		gridbag=new GridBagLayout();
		GridBagConstraints constraint=new GridBagConstraints();
		setLayout(gridbag);

		constraint.fill=GridBagConstraints.BOTH;

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		p1=new Panel();
		tf=new TextArea(" ",5,60, TextArea.SCROLLBARS_NONE); //TextField의 크기를 늘리기
		p1.add(tf);
		gridbag.setConstraints(p1,constraint);
		add(p1);

		constraint.weightx=0.25;
		constraint.gridwidth=1;
		Button b1=new Button("C");
		gridbag.setConstraints(b1,constraint);
		add(b1);

		Button b2=new Button("CE");
		gridbag.setConstraints(b2,constraint);
		add(b2);

		Button b3=new Button("1/x");
		gridbag.setConstraints(b3, constraint);
		add(b3);

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		Button b4=new Button("DEL");
		gridbag.setConstraints(b4, constraint);
		add(b4);

		constraint.gridwidth=1;
		Button b5=new Button("%");
		gridbag.setConstraints(b5,constraint);
		add(b5);

		Button b6=new Button("/");
		gridbag.setConstraints(b6,constraint);
		add(b6);

		Button b7=new Button("X");
		gridbag.setConstraints(b7, constraint);
		add(b7);

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		Button b8=new Button("-");
		gridbag.setConstraints(b8, constraint);
		add(b8);

		constraint.gridwidth=1;
		Button b9=new Button("7");
		gridbag.setConstraints(b9,constraint);
		add(b9);

		Button b10=new Button("8");
		gridbag.setConstraints(b10,constraint);
		add(b10);

		Button b11=new Button("9");
		gridbag.setConstraints(b11, constraint);
		add(b11);

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		Button b12=new Button("+");
		gridbag.setConstraints(b12, constraint);
		add(b12);

		constraint.gridwidth=1;
		Button b13=new Button("4");
		gridbag.setConstraints(b13,constraint);
		add(b13);

		Button b14=new Button("5");
		gridbag.setConstraints(b14,constraint);
		add(b14);

		Button b15=new Button("6");
		gridbag.setConstraints(b15, constraint);
		add(b15);

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		Button b16=new Button("()");
		gridbag.setConstraints(b16, constraint);
		add(b16);

		constraint.gridwidth=1;
		Button b17=new Button("1");
		gridbag.setConstraints(b17,constraint);
		add(b17);

		Button b18=new Button("2");
		gridbag.setConstraints(b18,constraint);
		add(b18);

		Button b19=new Button("3");
		gridbag.setConstraints(b19, constraint);
		add(b19);

		constraint.gridwidth=GridBagConstraints.REMAINDER;
		Button b20=new Button("+/-");
		gridbag.setConstraints(b20, constraint);
		add(b20);

		constraint.gridwidth=1;
		Button b21=new Button("0");
		gridbag.setConstraints(b21,constraint);
		add(b21);

		Button b22=new Button(".");
		gridbag.setConstraints(b22,constraint);
		add(b22);

		constraint.gridwidth=2;
		Button b23=new Button("=");
		gridbag.setConstraints(b23,constraint);
		add(b23);

		pack();
		setVisible(true);
	}
}