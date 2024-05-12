public class Notifier implements INotifier{
    private final String username;

    public Notifier(String username) {
        this.username = username;
    }

    @Override
    public void send(String message) {
        System.out.println("sending: " + message + " by email to: " + username);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
