import java.util.Map;


public class Main {
  static private final Map<String, String> config = Map.of(
    "platfotm", "desktop"
  );

  static public void main(String[] args) {
    final var platform = config.get("platfotm");
    final var isDesktop = platform.equals("desktop");
    final var dialog = isDesktop ? new DesktopDialog() : new WebDialog();
    dialog.render();
  }
}
