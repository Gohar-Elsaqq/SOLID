package openclosed;

class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService service) {
        this.notificationService = service;
    }

    public void notify(String message) {
        notificationService.send(message);
    }
}