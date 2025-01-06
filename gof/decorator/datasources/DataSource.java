package datasources;

public interface DataSource {
  public DataSource write(String data);
  public String read();
}