public class Main {
  static public void main(String[] args) {
    final var db = Database.getInstance();
    db.query("select * from users");
  }
}
