import graphic.*;

public class Main {
  static public void main(String[] args) {
    final var root = new CompoundGraphic();
    final var circles = new CompoundGraphic();
    final var squares = new CompoundGraphic();
    circles.add(new Circle(3, 2, 10));
    circles.add(new Circle(-4, 6, 9));
    squares.add(new Square(3, -1, 4));
    squares.add(new Square(4, 10, 1));
    root.add(circles).add(squares);
    circles.move(6, -1);
    squares.move(4, 1);
    root.move(1, 0);
    root.draw();
  }
}
