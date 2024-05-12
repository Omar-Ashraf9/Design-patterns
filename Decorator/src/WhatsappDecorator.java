public class WhatsappDecorator extends BaseNotifierDecorator{
    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("This message: " + message + " will be sent via Whatsapp");
    }
}
