
public class RoundPeg {
  private double radius;
  
  public RoundPeg(double radius) {
    this.radius = radius;
  }

  public RoundPeg() {
    this(0);
  }

  public double getRadius() {
    return radius;
  }

  public RoundPeg setRadius(double radius) {
    this.radius = radius;
    return this;
  }
}
