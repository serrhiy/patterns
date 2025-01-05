package devices;

public abstract class Device {
  protected boolean enabled = false;
  protected double volume = 0;
  protected String chanel;
  public boolean isEnabled() { return enabled; }
  public double getVolume() { return volume; }
  public String getChanel() { return chanel; }
  abstract public Device enable();
  abstract public Device disable();
  abstract public Device setVolume(double volume);
  abstract public Device setChanel(final String chanel);
}
