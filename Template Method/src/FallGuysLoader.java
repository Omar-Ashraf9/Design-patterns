public class FallGuysLoader extends BaseGameLoader{
    @Override
    public void downloadAssets() {
        System.out.println("Downloading Fall Guys assets...");
        System.out.println("Fall Guys assets downloaded!");
    }

    @Override
    public void CreateObjects() {
        System.out.println("Creating Fall Guys objects...");
        System.out.println("Fall Guys objects created!");
    }

    @Override
    public void loadLocalData() {
        System.out.println("Loading Fall Guys local data...");
        System.out.println("Fall Guys local data loaded!");
    }
}
