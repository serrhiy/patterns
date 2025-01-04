
public abstract class Dialog {

  abstract protected Button createButton();

  public void render() {
    final var button = createButton();
    button.onClick(() -> System.out.println("Clicked"));
    button.render();
  }
}
