class triangle implements Shapes
{

	@Override
	public  void draw() {
		 System.out.println("This will draw the  Tringale ");
	}

	public void getArea(int width, int height) {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle is: " + (0.5 * width * height));
	}
	
}
class square implements Shapes
{
	public void draw()
	{
		 System.out.println("This will draw the Square ");
			
		
	}
	public void getArea(int width, int height)
	{
		System.out.println("Area of Triangle is: " + (width * height));
		
	}
}
public class ShapesDemo {

	public static void main(String[] args) {
	   triangle t = new triangle();
	   t.draw();
	   t.getArea(10, 20);
	   square s = new square();
	   s.draw();
	   s.getArea(10, 20);
	}

}
