
public class SquarePegAdapter extends RoundPeg {
  private final SquarePeg peg;

  public SquarePegAdapter(final SquarePeg peg) {
    super(squareRadius(peg.getWidth()));
    this.peg = peg;
  }

  @Override
  public RoundPeg setRadius(double radius) {
    super.setRadius(squareRadius(peg.getWidth()));
    return this;
  }

  private static double squareRadius(double width) {
    return width * Math.sqrt(2) / 2;
  }
}
