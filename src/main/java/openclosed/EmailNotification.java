package openclosed;

class EmailNotification implements NotificationService {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}