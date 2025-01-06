package datasources;

public class CompressionDecorator extends DataSourceDecorator {
  public CompressionDecorator(final DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public DataSource write(String data) {
    System.out.println(data + " is compressed");
    return super.write(data);
  }

  @Override
  public String read() {
    System.out.println("data is decompressed");
    return super.read();
  }
}
