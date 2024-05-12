public class Main {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(new WhatsappDecorator(new Notifier("Hunter")));

        notifier.send("Even Dead I'm The Hunter. or E.D.I.T.H. for short.");
    }
}