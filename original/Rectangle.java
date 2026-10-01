
public class Rectangle {

	private double rectangle_width;
	private double rectangle_height;

	public Rectangle() {
		rectangle_width = 1.00;
		rectangle_height = 1.00;
	}

	public Rectangle(double new_width, double new_height) {
		this.rectangle_width = new_width;
		this.rectangle_height = new_height;
	}

//Method to return rectangle Area
	double getArea() {
		return rectangle_width * rectangle_height;
	}

//Method to return rectangle Perimeter
	double getPerimeter() {
		return (rectangle_width * 2) + (rectangle_height * 2);
	}

//Method to return the rectangle Width
	double getWidth() {
		return rectangle_width;
	}

//Method to return rectangle Height
	double getHeight() {
		return rectangle_height;
	}

//Method to set the new rectangle width
	public void setWidth(double new_width) {
		this.rectangle_width = new_width;
	}

//Method to set the new new rectangle height
	public void setHeight(double new_height) {
		this.rectangle_height = new_height;
	}

}
