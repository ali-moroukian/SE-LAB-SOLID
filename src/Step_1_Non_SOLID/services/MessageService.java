package Step_1_Non_SOLID.services;

import Step_1_Non_SOLID.models.EmailMessage;
import Step_1_Non_SOLID.models.SmsMessage;

public interface MessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
    public void sendEmailMessage(EmailMessage emailMessage);

}
