class PenUser2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Pen!");

		Pen2 mypen1=new Pen2();
		mypen1.write();
		
		Pen2 mypen2=new Pen2("IT��������");
		mypen2.write();

		Pen2 mypen3=new Pen2(2021);
		mypen3.write();

		Pen2 mypen4=new Pen2("SMU","Green",1000);
		mypen4.write();
	}
}
