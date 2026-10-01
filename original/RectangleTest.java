//Creates new class called RectangleTest
public class RectangleTest {

//Main code starts here
	public static void main(String[] args) {
//Code to create a new rectangle
		Rectangle r1 = new Rectangle(4, 40);
//Code to create a new rectangle
		Rectangle r2 = new Rectangle(3.5, 35.9);

//Code to print out the results for rectangle 1 on screen
		System.out.println("The Rectangle 1 width is: " + r1.getWidth());
		System.out.println("The Rectangle 1 height is: " + r1.getHeight());
		System.out.println("The Rectangle 1 area is: " + r1.getArea());
		System.out.println("The Rectangle 1 perimeter is: " + r1.getPerimeter());

//Code to print empty line between rectangle 1 and 2 results on screen
		System.out.println();

//Code to print out the results for rectangle 2 on screen
		System.out.println("The Rectangle 2 width is: " + r2.getWidth());
		System.out.println("The Rectangle 2 height is: " + r2.getHeight());
		System.out.println("The Rectangle 2 area is: " + r2.getArea());
		System.out.println("The Rectangle 2 perimeter is: " + r2.getPerimeter());
	}

}
