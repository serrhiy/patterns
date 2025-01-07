
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

  @Override
  public String getVideoInfo(String id) {
    System.out.println("Getting info");
    return id + " info";
  }

  @Override
  public String downloadVideo(String id) {
    System.out.println("Downloading video");
    return id + ".mp4";
  }
  
}
