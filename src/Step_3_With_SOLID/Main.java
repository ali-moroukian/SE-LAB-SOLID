package Step_3_With_SOLID;

import Step_3_With_SOLID.models.Message;
import Step_3_With_SOLID.services.EmailMessageService;
import Step_3_With_SOLID.services.MessageService;
import Step_3_With_SOLID.services.SmsMessageService;
import Step_3_With_SOLID.services.TelegramMessageService;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    private static final int SMS_ID = 1;
    private static final int EMAIL_ID = 2;
    private static final int TELEGRAM_ID = 3;


    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer = 0;
        do {

            System.out.println("In order to send Sms message enter " + SMS_ID);
            System.out.println("In order to send Email message enter " + EMAIL_ID);
            System.out.println("In order to send Telegram message enter " + TELEGRAM_ID);
            System.out.println("In order to Exit, Enter 0");

            userAnswer = scanner.nextInt();

            if (userAnswer == 0) {
                break;
            }

            Message message = new Message();

            System.out.println(getEnterSourceTitle(userAnswer));
            String source = scanner.next();
            message.setSource(source);

            System.out.println(getEnterTargetTitle(userAnswer));
            String target = scanner.next();
            message.setTarget(target);

            System.out.println("Write Your Message : ");
            String content = scanner.next();
            message.setContent(content);

            MessageService messageService = getMessageService(userAnswer);
            messageService.send(message);

        } while (true);
    }

    private static String getEnterSourceTitle(int userAnswer) {
        switch (userAnswer) {
            case SMS_ID:
                return "Enter source phone : ";
            case EMAIL_ID:
                return "Enter source email : ";
            case TELEGRAM_ID:
                return "Enter source telegramId : ";
        }
        throw new Error("wrong input");
    }

    private static String getEnterTargetTitle(int userAnswer) {
        switch (userAnswer) {
            case SMS_ID:
                return "Enter target phone : ";
            case EMAIL_ID:
                return "Enter target email : ";
            case TELEGRAM_ID:
                return "Enter target telegramId : ";
        }
        throw new Error("wrong input");
    }

    private static MessageService getMessageService(int userAnswer) {
        switch (userAnswer) {
            case SMS_ID:
                return new SmsMessageService();
            case EMAIL_ID:
                return new EmailMessageService();
            case TELEGRAM_ID:
                return new TelegramMessageService();
        }
        throw new Error("wrong input");
    }
}