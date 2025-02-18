package D.right;

public class UserController {
    private final NotificationService notificationService;

    public UserController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.sendNotification("Hello, User!");
    }
}
