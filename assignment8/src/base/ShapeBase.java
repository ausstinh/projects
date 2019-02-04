package base;

public class ShapeBase implements ShapeInterface{

	
	protected String name;
	protected double width, height;
	protected double width2;
	protected double radius;
	
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ShapeBase(String name, double width, double height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public double getWidth2() {
		return width2;
	}

	public void setWidth2(double width2) {
		this.width2 = width2;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
