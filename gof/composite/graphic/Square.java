package graphic;

public class Square extends Shape {
  protected double width;

  public Square(double x, double y, double width) {
    super(x, y);
    this.width = width;
  }

  @Override
  public void move(double x, double y) {
    this.x += x;
    this.y += y;
    System.out.println("Square is moved");
  }

  @Override
  public void draw() {
    System.out.println("Square is drawn");
  }
}
