package D.wrong;

public class UserController {
    private EmailNotificationService emailNotificationService = new EmailNotificationService();

    public void notifyUser() {
        emailNotificationService.sendEmail("Wake up!");
    }
}
