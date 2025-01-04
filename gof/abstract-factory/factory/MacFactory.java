package factory;

import button.Button;
import checkbox.Checkbox;

public class MacFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new button.MacButton();
  }

  @Override
  public Checkbox createCheckbox() {
   return new checkbox.MacCheckbox(); 
  }
}
