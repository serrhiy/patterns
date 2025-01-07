import java.util.ArrayList;
import java.util.List;

public class Forest {
  private final List<Tree> trees = new ArrayList<>();

  public Forest plantTree(double x, double y, TreeType type) {
    final var tree = new Tree(x, y, type);
    trees.add(tree);
    return this;
  }

  public Forest draw() {
    for (final var tree: trees) tree.draw();
    return this;
  }
}
