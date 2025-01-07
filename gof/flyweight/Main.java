public class Main {
  static public void main(String[] args) {
    final var forest = new Forest();
    forest.plantTree(1, 2, TreeTypeFactory.getTreeType("oak", "brown", "oak.tex"));
    forest.plantTree(-2, 8, TreeTypeFactory.getTreeType("birch", "white", "birch.tex"));
    forest.plantTree(5, -2, TreeTypeFactory.getTreeType("oak", "brown", "oak.tex"));
    forest.draw();
  }
}
