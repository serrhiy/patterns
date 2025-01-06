package datasources;

public class DataSourceDecorator implements DataSource {
  private final DataSource wrapped;

  public DataSourceDecorator(final DataSource dataSource) {
    this.wrapped = dataSource;
  }

  @Override
  public DataSource write(String data) {
    return wrapped.write(data);
  }

  @Override
  public String read() {
    return wrapped.read();
  }
}
