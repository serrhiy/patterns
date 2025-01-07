
public class TreeType {
  private final String name;
  private final String color;
  private final String texture;

  public TreeType(final String name, final String color, final String texture) {
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  public String getName() { return name; }
  public String getColor() { return color; }
  public String getTexture() { return texture; }
}