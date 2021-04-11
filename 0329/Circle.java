public class Circle extends Shape
{
	protected String name;
	//override
	public void draw(){
		name="Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String [] args){
		Shape b=new Circle();
		b.paint();
	}
}