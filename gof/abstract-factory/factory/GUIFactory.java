package factory;

import button.Button;
import checkbox.Checkbox;

public interface GUIFactory {
  public Button createButton();
  public Checkbox createCheckbox();
}
