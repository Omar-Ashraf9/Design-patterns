public class FacebookDecorator extends BaseNotifierDecorator{
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("This message: " + message + " will be sent via Facebook");
    }
}
