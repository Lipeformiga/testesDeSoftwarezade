public class NotificationService {

    private EmailService emailService;

    public NotificationService(EmailService emailService){
        this.emailService = emailService;
    }
    //Simula o emvio de uma notificação
    public boolean sendNotifications(String userEmail, String message){
        if (userEmail == null || message == null || message.isEmpty()){
            return false;
        }
        String subject = "Notificação importante";
        return emailService.sendEmail(userEmail,subject,message);
    }
}
