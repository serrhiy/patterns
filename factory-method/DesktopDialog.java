
public class DesktopDialog extends Dialog {
  @Override
  protected Button createButton() {
    return new DesktopButton();
  }
}
