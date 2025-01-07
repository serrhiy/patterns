public class Tree {
  private final double x;
  private final double y;
  private final TreeType treeType;
  public Tree(final double x, final double y, final TreeType type) {
    this.x = x;
    this.y = y;
    this.treeType = type;
  }

  public void draw() {
    final var template = "Drawing tree %s with color %s and texture %s in (%f, %f)\n";
    final var name = treeType.getName();
    final var color = treeType.getColor();
    final var texture = treeType.getTexture();
    System.out.printf(template, name, color, texture, x, y);
  }
}
