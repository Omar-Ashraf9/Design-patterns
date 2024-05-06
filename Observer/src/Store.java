public class Store {
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newProductArrived(String productName) {
        System.out.println("New product arrived: " + productName);
        notificationService.notifyObservers();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
