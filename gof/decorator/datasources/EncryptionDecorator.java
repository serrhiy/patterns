package datasources;

public class EncryptionDecorator extends DataSourceDecorator {
  public EncryptionDecorator(final DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public DataSource write(String data) {
    System.out.println(data + " is encrypted");
    return super.write(data);
  }

  @Override
  public String read() {
    System.out.println( "data is decrypted");
    return super.read();
  }
}
