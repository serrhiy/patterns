package graphic;

public class Circle extends Shape {
  protected double radius;

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public void move(double x, double y) {
    this.x += x;
    this.y += y;
    System.out.println("Circle is moved");
  }

  @Override
  public void draw() {
    System.out.println("Circle is drawn");
  }
}
