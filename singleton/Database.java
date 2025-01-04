
public class Database {
  static private Database instance = null;

  private Database() {

  };

  static public Database getInstance() {
    if (instance == null) instance = new Database();
    return instance;
  }

  public void query(final String sql) {
    System.out.println(sql);
  }
}