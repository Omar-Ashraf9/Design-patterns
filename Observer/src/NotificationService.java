import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject {
    private final List<User> interestedUsers;

    public NotificationService(){
        this.interestedUsers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        interestedUsers.add((User) observer);
    }

    @Override
    public void remove(Observer observer) {
        interestedUsers.remove((User) observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying interested users...");
        interestedUsers.forEach(User::update);
        System.out.println("===== Notification sent =====");
    }
}
