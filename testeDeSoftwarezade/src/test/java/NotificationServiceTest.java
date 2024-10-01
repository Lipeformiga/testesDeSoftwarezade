import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification(){
        EmailService emailService = new EmailService();

        NotificationService notificationService = new NotificationService(emailService);

        boolean result = notificationService.sendNotifications("user@example.com","Sua conta foi atualizada");
        assertTrue(result,"A notificação deveria ser enviada com sucesso");

        assertEquals(1,emailService.getSendEmails().size());
        assertTrue(emailService.getSendEmails().get(0).contains("user@example.com"));

        result = notificationService.sendNotifications("","Mensagem sem email");
        assertFalse(result, "O envio deveria falhar com email inválido");

        result = notificationService.sendNotifications("user@example.com","");
        assertFalse(result, "O envio deveria falhar com mensagem vazia");
    }
}