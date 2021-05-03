import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TabTest implements ItemListener, ActionListener
{
	JFrame jf;
	JTabbedPane tabpane;
	JLabel label, label1, label2,text,doglabel,doglabel1;
	JPanel one, two, go, back,three,four, checkpanel,sizePanel,orderPanel, resultPanel;
	ImageIcon logo, dog;
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = { "apple", "banana", "grape" };
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	JRadioButton small, medium, large;
	ButtonGroup size;
	JButton button,button1;
	public TabTest(String msg){
		jf=new JFrame(msg);
		tabpane=new JTabbedPane();
		
		one=new JPanel();
		two=new JPanel();
		three=new JPanel();
		four=new JPanel();

		one.setBackground(Color.yellow);
		two.setBackground(Color.green);
		three.setBackground(Color.blue);
		four.setBackground(Color.red);
		
		//one�ǳڿ��� smu ���� �־��.
		logo=new ImageIcon("../image/sm_logo.gif");
		label=new JLabel("�����ڴ��б� it���а� 2015834 ������",logo,JLabel.RIGHT);
		label.setFont(new Font("����",Font.BOLD, 30));
		one.add(label);

		//two�ǳڿ��� ������
		go=new JPanel();
		doglabel=new JLabel("�������� �������� ����ʹٸ�! ��ư�� �������� ->");
		button = new JButton("����");
		go.add(doglabel);
		go.add(button);
		
		back=new JPanel();
		back.setBackground(Color.green);
		doglabel1=new JLabel("������ ����~");
		dog = new ImageIcon("../image/dog.gif");
		doglabel1.setIcon(dog);
		button1 = new JButton("Good luck!!!");
		back.add(doglabel1);
		back.add(button1);

		two.add(go);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setVisible(false);
				back.setVisible(true);
				two.add(back);
			}
		});

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back.setVisible(false);
				go.setVisible(true);
				two.add(go);
			}
		});

		//three�ǳڿ��� ����
		three.setLayout(new GridLayout(0, 4));
		// üũ �ڽ� ����
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel("../image/"+fruits[i] + ".png");
			icon[i] = new ImageIcon("../image/"+fruits[i] + ".png");
		}
		checkpanel = new JPanel(new GridLayout(0, 1));
		checkpanel.setBackground(Color.blue);
		for (int i = 0; i < 3; i++)
			checkpanel.add(buttons[i]);

		three.add(checkpanel);
		three.add(pictureLabel[0]);
		three.add(pictureLabel[1]);
		three.add(pictureLabel[2]);

		//four�ǳڿ��� Ŀ���ֹ�
		four.setLayout(new BorderLayout());
		orderPanel=new JPanel();
		label2=new JLabel("����, ��� �������� Ŀ�Ǹ� �ֹ��Ұž�?");
		label2.setForeground(Color.white);
		orderPanel.setBackground(Color.red);
		orderPanel.add(label2);
		four.add(orderPanel,BorderLayout.NORTH);
		
		sizePanel=new JPanel();
		sizePanel.setBackground(Color.red);
		small=new JRadioButton("Small Size");
		medium=new JRadioButton("Medium Size");
		large=new JRadioButton("Large Size");

		size=new ButtonGroup();

		size.add(small);
		size.add(medium);
		size.add(large);

		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		four.add(sizePanel, BorderLayout.CENTER);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);

		resultPanel=new JPanel();
		resultPanel.setBackground(Color.red);
		text=new JLabel("���� �ƹ��͵� �ֹ����� �ʾҳ׿�!");
		text.setForeground(Color.white);

		resultPanel.add(text);
		four.add(resultPanel, BorderLayout.SOUTH);

		tabpane.addTab("���б�",one);
		tabpane.addTab("������",two);
		tabpane.addTab("����",three);
		tabpane.addTab("Ŀ��",four);


		jf.getContentPane().add(tabpane,BorderLayout.CENTER);
		jf.setSize(800,500);
		jf.setVisible(true);
	}
		
	public void itemStateChanged(ItemEvent e) {
		//three �ǳڿ����� Ŭ���� ���� �̺�Ʈ ó��
		ImageIcon image = null;
		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
				}
			}
	}

	public void actionPerformed(ActionEvent e){
		//4�� �ǳڿ����� Ŭ���� ���� �̺�Ʈ ó��
		if (e.getSource()==small)
			text.setText("Small Size�� �ֹ��Ͽ����ϴ�.!");
		if (e.getSource()==medium)
			text.setText("Medium Size�� �ֹ��Ͽ����ϴ�.!");
		if (e.getSource()==large)
			text.setText("Large Size�� �ֹ��Ͽ����ϴ�.!");
	}
}
