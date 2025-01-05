import java.util.Map;
import devices.*;

public class Main {
  static private final Map<String, Class<? extends Device>> devices = Map.of(
    TV.class.getSimpleName().toLowerCase(), TV.class,
    Radio.class.getSimpleName().toLowerCase(), Radio.class
  );
  static private final Map<String, String> config = Map.of(
    "device", "radio"
  );
  static public void main(String[] args) throws Exception {
    final var deviceName = config.get("device");
    final var deviceClass = devices.get(deviceName);
    final var constructor = deviceClass.getDeclaredConstructor();
    final var device = constructor.newInstance();
    final var remote = new Remote(device);
    remote.togglePower();
    remote.togglePower();
  }  
}
