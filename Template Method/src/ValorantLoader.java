public class ValorantLoader extends BaseGameLoader {
    @Override
    public void downloadAssets() {
        System.out.println("Downloading Valorant assets...");
        System.out.println("Valorant assets downloaded!");
    }

    @Override
    public void CreateObjects() {
        System.out.println("Creating Valorant objects...");
        System.out.println("Valorant objects created!");
    }

    @Override
    public void loadLocalData() {
        System.out.println("Loading Valorant local data...");
        System.out.println("Valorant local data loaded!");
    }
}
