class Point {

	double x;
	double y;

	Point(double x1, double y1) {
		x = x1;
		y = y1;
	}

	void setPosition(double x1, double y1) {
		x = x1;
		y = y1;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}
}

abstract class Shape {
	Point point;

	Shape() {
		point = new Point(0.0, 0.0);
	}

	Shape(Point p) {
		point = p;
	}

	abstract void printPoint();

}

class Rectangle extends Shape {
	double height;
	double width;

	Rectangle(Point p, double h, double w) {
		point = p;
		height = h;
		width = w;
	}

	void printPoint() {
		System.out.print("Left Top Point of the Rectangle: \t");
		System.out.println("X: " + point.getX() + "\tY:\t" + point.getY());
	}

	double getArea() {
		return width * height;
	}

}

class Circle extends Shape {
	double radius;

	Circle(Point p, double r) {
		point = p;
		radius = r;
	}

	void printPoint() {
		System.out.print("Center Point of the Circle: \t");
		System.out.println("X: " + point.getX() + "\tY:\t" + point.getY());
	}

	double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}

public class abscls {
	public static void main(String[] args) {
		Point p = new Point(0, 0);
		Rectangle r = new Rectangle(p, 10.0, 20.0);

		r.printPoint();
		System.out.println(r.getArea());

		p = new Point(10, 10);
		Circle c = new Circle(p, 10.0);
		c.printPoint();
		System.out.println(c.getArea());

	}

}
