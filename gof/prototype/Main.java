import shapes.*;
import java.util.List;

public class Main {
  static public void main(String[] args) {
    final var square = new Square(10, 3, 2, "red");
    final var circle = new Circle(-9, 3, 3, "green");
    final var shapes = List.of(square, circle);
    for (final var shape: shapes) {
      final var copy = shape.clone();
      System.out.println(copy == shape);
    }
  }
}
