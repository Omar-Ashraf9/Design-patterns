public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        store.getNotificationService().register(user1);
        store.getNotificationService().register(user2);

        store.newProductArrived("Apple");
        store.newProductArrived("Banana");



    }
}