package openclosed;

class SMSNotification implements NotificationService {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}