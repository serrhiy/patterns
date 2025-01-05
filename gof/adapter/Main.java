
public class Main {
  static public void main(String[] args) {
    final var hole = new RoundHole(6);
    final var square = new SquarePeg(5);
    final var adapter = new SquarePegAdapter(square);
    System.out.println(hole.fits(adapter));
  }  
}
