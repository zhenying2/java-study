class Student extends Members 
{
	String dept;
	Members students[];
	public Student(String name, String idnum, String dept){
		super(name,idnum);
		this.dept=dept;
	}
	
	public void setStudents(Members sub[]){
		students=sub;
	}
	public void work(){
		System.out.println("Student: \""+name+"\" studies hard with his students in "+dept+" dept.");
	}
}