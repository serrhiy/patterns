import datasources.*;

public class Main {
  static public void main(String[] args) {
    final var source = new FileDataSource("test.txt");
    final var compression = new CompressionDecorator(source);
    final var encrypton = new EncryptionDecorator(compression);
    encrypton.write("Hello world");
  }
}
