package DataFiles;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.Test;

public class MailTest {
    @Test
    public static void sendEmailWithAttachment() throws EmailException, EmailException {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("G:\\Digicorp Projects\\GitLab\\src\\test\\resources\\excelsheets\\TestCases.xlsx");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of John");
        attachment.setName("Cases.xlsx");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setAuthenticator(new DefaultAuthenticator("digicorp.automationreports@gmail.com", "Digicorp@123"));
        email.setSSLOnConnect(true);
        email.setSmtpPort(587);
        email.addTo("nikhil.pandit1020@gmail.com", "Nikhil Pandit ji sir");
        email.setFrom("chinmaybhgt2@gmail.com", "Me");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
    }
}
