import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
  static private final Map<String, TreeType> treeTypes = new HashMap<>();

  static public TreeType getTreeType(String name, String color, String texture) {
    final var hash = name + texture + color;
    final var contains = treeTypes.containsKey(hash);
    if (!contains) {
      System.out.println("New tree " + name);
      final var treeType = new TreeType(name, color, texture);
      treeTypes.put(hash, treeType);
    }
    return treeTypes.get(hash);
  }
}
