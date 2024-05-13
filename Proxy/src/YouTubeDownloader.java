public class YouTubeDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String url) {
        System.out.println("Connecting to YouTube...");
        System.out.println("Downloading the video...");
        System.out.println("Saving the video...");
        System.out.println("==========Video downloaded successfully!==========");
        return new Video();
    }
}
