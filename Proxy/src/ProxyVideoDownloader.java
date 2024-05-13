import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{
    private final Map<String, Video> cache = new HashMap<>();
    private final YouTubeDownloader yTDownloader = new YouTubeDownloader();

    @Override
    public Video getVideo(String url) {
        if (!cache.containsKey(url)) {
            Video video = yTDownloader.getVideo(url);
            cache.put(url, video);
        }else {
            System.out.println("Retrieving video from cache...");
            System.out.println("==========Video retrieved successfully!==========");
        }
        return cache.get(url);

    }
}
