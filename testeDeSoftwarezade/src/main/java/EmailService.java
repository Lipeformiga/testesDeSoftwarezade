import java.util.ArrayList;
import java.util.List;

public class EmailService {

    private List<String> sendEmails = new ArrayList<>();

    public boolean sendEmail(String to, String subject, String body){
        if (to == null || subject == null || body == null || to.isEmpty()){
            return false;
        }
        String email = "Para " + to + ", Assunto: "+ subject + ", Corpo" + body;
        sendEmails.add(email);

        System.out.println("Email enviado: "+ email);
        return true;
    }

    public List<String> getSendEmails(){
        return sendEmails;
    }

}
