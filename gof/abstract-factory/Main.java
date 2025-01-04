import factory.*;

import java.util.Map;

public class Main {
  static private final Map<String, Class<? extends GUIFactory>> platforms = Map.of(
    "linux", LinuxFactory.class,
    "mac", MacFactory.class
  );
  static private final Map<String, String> config = Map.of(
    "platform", "mac"
  );
  static public void main(String[] args) throws Exception {
    final var platform = config.get("platform");
    final var factoryClass = platforms.get(platform);
    final var constructor = factoryClass.getDeclaredConstructor();
    final var factory = constructor.newInstance();
    final var checkbox = factory.createCheckbox();
    final var button = factory.createButton();
    checkbox.render();
    button.render();
  }
}
