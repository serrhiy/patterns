import java.lang.Runnable;

public abstract class Button {
  private Runnable onClick;

  abstract public void render();

  public void onClick(final Runnable callback) {
    this.onClick = callback;
  }

  public void click() {
    if (onClick != null) onClick.run();
  }
}
