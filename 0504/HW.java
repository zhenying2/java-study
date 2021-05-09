import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class HW
{
	JFrame jf;
	JTabbedPane tabpane;
	JPanel zero, one, two,three,four,five; 

	ImageIcon my_picture;
	JLabel img,explain,explain1,explain2,explain3,explain4,explain5,explain6;

	public HW(String msg){
		jf=new JFrame(msg);
		tabpane=new JTabbedPane();
		zero=new JPanel();
		one=new JPanel();
		two=new JPanel();
		three=new JPanel();
		four=new JPanel();
		five=new JPanel();

		//zero 판넬에는 인사말문구를 넣는다.
		my_picture=new ImageIcon("../image/my_picture.gif");
		img=new JLabel(my_picture);
		explain=new JLabel("안녕하세요, 저는 숙명여자대학교 IT공학과에 재학중인 김진영입니다.");
		explain1=new JLabel("제가 2021 1학기에 듣는 수업은 총 7과목 입니다.");
		explain2=new JLabel("월요일 4개, 화요일 2개, 수요일 4개, 목요일 2개, 금요일 1개입니다.");
		explain3=new JLabel("본전공은 월요일 3개, 화요일 1개, 수요일 3개, 목요일 1개이고,");
		explain4=new JLabel("복수전공으로 월,화,수,목,금 모두 1개 입니다. ");
		explain5=new JLabel("이러한 값을 통해, 요일에 따른 수업의 개수를 차트로 표현해보겠습니다.");
		explain6=new JLabel("또, 눈사람을 색칠하는 것과 입력데이터 받는 이벤트도 있답니다~");
		zero.add(img); zero.add(explain); zero.add(explain1); zero.add(explain2);zero.add(explain3);zero.add(explain4);zero.add(explain5);zero.add(explain6);
		
		//원형차트
		one=new HW_Panel1();

		//two판넬에는 막대차트로 요일별 강의를 표현해본다.
		two=new HW_Panel2();


		//three판넬에는 본전공과 복수전공 강의 개수에 따른 선형차트를 표현해본다.
		three=new HW_Panel3();


		//four판넬에는 내가만든 눈사람 색칠하는 것으로 표현해본다. 
		four=new HW_Panel4();
		
		//five판넬에는 입력데이터
		five=new HW_Panel5();

		tabpane.addTab("인사말",zero);
		tabpane.addTab("원형차트",one);
		tabpane.addTab("막대차트",two);
		tabpane.addTab("선형차트",three);
		tabpane.addTab("진영's 눈사람",four);
		tabpane.addTab("입력 데이터",five);


		jf.getContentPane().add(tabpane,BorderLayout.CENTER);
		jf.setSize(500,500);
		jf.setVisible(true);
	}
}
