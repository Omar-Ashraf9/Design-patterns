public class Main {
    public static void main(String[] args) {
        VideoDownloader smartDownloader = new ProxyVideoDownloader();

        smartDownloader.getVideo("video1");
        smartDownloader.getVideo("video1"); // should not download video again
        smartDownloader.getVideo("video2");
    }
}