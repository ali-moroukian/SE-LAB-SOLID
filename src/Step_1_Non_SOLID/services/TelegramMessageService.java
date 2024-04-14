package Step_1_Non_SOLID.services;

import Step_1_Non_SOLID.models.EmailMessage;
import Step_1_Non_SOLID.models.SmsMessage;
import Step_1_Non_SOLID.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        // Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        // Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        System.out.println(
                "Sending a Telegram message from "
                        + telegramMessage.getSourceTelegramId()
                        + " to "
                        + telegramMessage.getTargetTelegramId()
                        + " with content : "
                        + telegramMessage.getContent()
        );
    }
}
