import devices.Device;

public class Remote {
  protected final Device device;

  public Remote(final Device device) {
    this.device = device;
  }

  public Remote togglePower() {
    if (device.isEnabled()) device.disable();
    else device.enable();
    return this;
  }

  public Remote volumeUp() {
    device.setVolume(device.getVolume() + 10);
    return this;
  }

  public Remote volumeDown() {
    device.setVolume(device.getVolume() - 10);
    return this;
  }

  public Remote changeChanel(final String chanel) {
    device.setChanel(chanel);
    return this;
  }
}
