package openclosed;

public class main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotification();
        NotificationManager emailManager  = new NotificationManager(emailService);
        emailManager.notify("Hello, this is an email notification!");
        NotificationService smsService = new EmailNotification();
        NotificationManager smsManager  = new NotificationManager(smsService);
        smsManager.notify("Hello, this is an SMS notification!");
    }
}
