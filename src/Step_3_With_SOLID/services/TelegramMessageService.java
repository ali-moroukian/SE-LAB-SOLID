package Step_3_With_SOLID.services;

import Step_3_With_SOLID.models.Message;

public class TelegramMessageService implements MessageService {

    @Override
    public void send(Message message) {
        System.out.println(
                "Sending a Telegram message from "
                        + message.getSource()
                        + " to "
                        + message.getTarget()
                        + " with content : "
                        + message.getContent()
        );
    }
}
