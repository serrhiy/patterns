package shapes;

public class Circle extends Shape {

  protected final double radius;

  public Circle(double x, double y, double radius, String color) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public Shape clone() {
    return new Circle(x, y, radius, color);
  }
}
