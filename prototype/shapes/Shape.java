package shapes;

public abstract class Shape {
  protected final double x;
  protected final double y;
  protected final String color;

  public Shape(double x, double y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String getColor() {
    return color;
  }

  public abstract Shape clone();
}