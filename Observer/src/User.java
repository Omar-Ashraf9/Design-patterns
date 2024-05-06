import interfaces.Observer;
public class User implements Observer{
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("User " + name + " has been notified.");
    }
}
