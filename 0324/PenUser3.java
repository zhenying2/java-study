class PenUser3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Pen!");

		Pen3 mypen1=new Pen3();
		mypen1.write();
		mypen1.write(10000); //price
		mypen1.write(1000,"Red"); //price,color

		Pen3 mypen2=new Pen3("IT���а�"); //vender ����
		mypen2.write();
		mypen2.write(20000); //price
		mypen2.write(2000,"SMU2"); //price,colormypen1.write();

		Pen3 mypen3=new Pen3("IT���а�","�����",30000); //3���� ����
		mypen3.write();
		mypen3.write(20000); //price
		mypen3.write(3000,"SMU3"); //price,vender
		mypen3.write(3000,"SMU3","Yellow");//price, vender,color
	}
}
