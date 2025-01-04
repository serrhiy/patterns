package shapes;

public class Square extends Shape {
  protected final double width;

  public Square(double x, double y, double width, String color) {
    super(x, y, color);
    this.width = width;
  }

  @Override
  public Shape clone() {
    return new Square(x, y, width, color);
  }
}
