package datasources;

public class FileDataSource implements DataSource {
  private final String filename;
  private String data;

  public FileDataSource(final String filename) {
    this.filename = filename;
  }

  @Override
  public DataSource write(String data) {
    System.out.println(data + " is writen to " + filename);
    this.data = data;
    return this;
  }

  @Override
  public String read() {
    System.out.println(data + " is read from " + filename);
    return data;
  }
}
