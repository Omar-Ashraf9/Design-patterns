public abstract class BaseGameLoader {

    public void loadGame() {
        System.out.println("Loading game...");
        loadLocalData();
        CreateObjects();
        downloadAssets();
        cleanTempFiles();
        initializeProfiles();
        System.out.println("Game loaded!");
    }

    private void initializeProfiles() {
        System.out.println("Initializing profiles...");
        System.out.println("Profiles initialized!");
    }

    private void cleanTempFiles() {
        System.out.println("Cleaning temp files...");
        System.out.println("Temp files cleaned!");
    }

    public abstract void downloadAssets();

    public abstract void CreateObjects();

    public abstract void loadLocalData();
}
