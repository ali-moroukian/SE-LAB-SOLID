package Step_3_With_SOLID.services;

import Step_3_With_SOLID.models.Message;

import java.util.regex.Pattern;

public class EmailMessageService implements MessageService {

    @Override
    public void send(Message emailMessage) {
        if(validateEmailAddress(emailMessage.getSource()) && validateEmailAddress(emailMessage.getTarget())){
            System.out.println("Sending a SMS from " + emailMessage.getSource() + " to " + emailMessage.getTarget() + " with content : " + emailMessage.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    public boolean validateEmailAddress(String email) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }
}
