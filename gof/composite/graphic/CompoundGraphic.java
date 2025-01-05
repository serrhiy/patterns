package graphic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundGraphic implements Graphic {
  protected final List<Graphic> graphics;

  public CompoundGraphic(Graphic ...graphics) {
    final var list = Arrays.asList(graphics);
    this.graphics = new ArrayList<>(list);
  }

  public CompoundGraphic() {
    this.graphics = new ArrayList<>();
  }

  @Override
  public void move(double x, double y) {
    for (final var graphic: graphics) graphic.move(x, y);
    System.out.println("CompoundGraphic is moved");
  }

  @Override
  public void draw() {
    for (final var graphic: graphics) graphic.draw();
    System.out.println("CompoundGraphic is drawn");
  }

  public CompoundGraphic add(final Graphic graphic) {
    this.graphics.add(graphic);
    return this;
  }

  public CompoundGraphic remove(final Graphic graphic) {
    if (this.graphics.contains(graphic)) this.graphics.remove(graphic);
    return this;
  }
}
