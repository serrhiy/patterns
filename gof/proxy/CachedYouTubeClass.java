import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
  private final ThirdPartyYouTubeLib service;
  private final Map<String, String> videos = new HashMap<>();
  private final Map<String, String> info = new HashMap<>();

  public CachedYouTubeClass(final ThirdPartyYouTubeLib serive) {
    this.service = serive;
  }

  @Override
  public String getVideoInfo(String id) {
    System.out.println("Getting info from cache");
    final var contains = info.containsKey(id);
    if (!contains) {
      final var information = service.getVideoInfo(id);
      info.put(id, information);
    }
    return info.get(id);
  }

  @Override
  public String downloadVideo(String id) {
    System.out.println("Downloading video from cache");
    final var contains = videos.containsKey(id);
    if (!contains) {
      final var video = service.downloadVideo(id);
      videos.put(id, video);
    }
    return videos.get(id);
  }
  
}
