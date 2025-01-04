package factory;

import button.Button;
import checkbox.Checkbox;

public class LinuxFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new button.LinuxButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new checkbox.LinuxCheckbox();
  }
}
