package devices;

public class Radio extends Device {

  @Override
  public Device enable() {
    System.out.println("Radio is enabled");
    enabled = true;
    return this;
  }

  @Override
  public Device disable() {
    System.out.println("Radio is disabled");
    enabled = false;
    return this;
  }

  @Override
  public Device setVolume(double volume) {
    this.volume = volume;
    return this;
  }

  @Override
  public Device setChanel(final String chanel) {
    this.chanel = chanel;
    return this;
  }
}
