class School 
{
	Teacher yiyoon;
	Student kim, song;
	Members choi, lee;
	Members students[];

	public School(){
		yiyoon=new Teacher("Yoon","M10313","IT공학전공");
		kim=new Student("kim","IT200324","IT공학전공");
		song=new Student("song","statics190324","통계학전공");
		choi=new Members("choi","IT180324");
		lee=new Members("lee","math210324");

		students=new Members[5];
		students[0]=yiyoon;
		students[1]=kim;
		students[2]=song;
		students[3]=choi;
		students[4]=lee;
	}
	
	public void makeWork(){
		int n=students.length;
		for (int i=0; i<n; i++)
		{
			students[i].work();
		}
	}
	
	public static void main(String[] args) 
	{
		School mycom=new School();
		mycom.makeWork();
	}
}
