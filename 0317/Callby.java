public class Callby
{
	public static void value(int a) 
	{
		a+=50;
		System.out.println("value() method: a = "+a);
	}
	public static void ref(Car car){
		car.price -=100;
		car.owner="Me";
		System.out.println("refer() method: car.price = "+car.price+"\t car.owner = "+car.owner);
	}
}
