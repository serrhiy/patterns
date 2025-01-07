public class Main {
  static public void main(String[] args) {
    final var youtube = new ThirdPartyYouTubeClass();
    final var proxied = new CachedYouTubeClass(youtube);
    proxied.downloadVideo("hello-world");
    proxied.downloadVideo("hello-world");
    proxied.downloadVideo("hello-world");
  }
}
