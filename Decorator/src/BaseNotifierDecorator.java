public class BaseNotifierDecorator implements INotifier{
    private final INotifier wrapped;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
