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
		
		//one판넬에는 smu 문구 넣어본다.
		logo=new ImageIcon("../image/sm_logo.gif");
		label=new JLabel("숙명여자대학교 it공학과 2015834 김진영",logo,JLabel.RIGHT);
		label.setFont(new Font("굴림",Font.BOLD, 30));
		one.add(label);

		//two판넬에는 강아지
		go=new JPanel();
		doglabel=new JLabel("진영이의 강아지가 보고싶다면! 버튼을 누르세요 ->");
		button = new JButton("뚱이");
		go.add(doglabel);
		go.add(button);
		
		back=new JPanel();
		back.setBackground(Color.green);
		doglabel1=new JLabel("내동생 뚱이~");
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

		//three판넬에는 과일
		three.setLayout(new GridLayout(0, 4));
		// 체크 박스 생성
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

		//four판넬에는 커피주문
		four.setLayout(new BorderLayout());
		orderPanel=new JPanel();
		label2=new JLabel("진영, 어느 사이즈의 커피를 주문할거야?");
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
		text=new JLabel("아직 아무것도 주문하지 않았네요!");
		text.setForeground(Color.white);

		resultPanel.add(text);
		four.add(resultPanel, BorderLayout.SOUTH);

		tabpane.addTab("대학교",one);
		tabpane.addTab("강아지",two);
		tabpane.addTab("과일",three);
		tabpane.addTab("커피",four);


		jf.getContentPane().add(tabpane,BorderLayout.CENTER);
		jf.setSize(800,500);
		jf.setVisible(true);
	}
		
	public void itemStateChanged(ItemEvent e) {
		//three 판넬에서의 클릭에 따른 이벤트 처리
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
		//4번 판넬에서의 클릭에 따른 이벤트 처리
		if (e.getSource()==small)
			text.setText("Small Size를 주문하였습니다.!");
		if (e.getSource()==medium)
			text.setText("Medium Size를 주문하였습니다.!");
		if (e.getSource()==large)
			text.setText("Large Size를 주문하였습니다.!");
	}
}
