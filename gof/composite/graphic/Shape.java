package graphic;

public abstract class Shape implements Graphic {
  protected double x;
  protected double y;

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }
}
