package ar.com.bateriasroca.brspringwebapp.services;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.InputStream;

@Service
public class EmailServiceImpl extends JavaMailSenderImpl implements EmailService{


    @Override
    public MimeMessage createMimeMessage() {
        return super.createMimeMessage();
    }

    @Override
    public MimeMessage createMimeMessage(InputStream inputStream) throws MailException {
        return super.createMimeMessage(inputStream);
    }

    @Override
    public void send(MimeMessage mimeMessage) throws MailException {
        try{
            super.send(mimeMessage);
        }catch (Exception e){
            throw new MailSendException("Unable to send message");
        }
    }

    @Override
    public void send(MimeMessage... mimeMessages) throws MailException {
         try {
             super.send(mimeMessages);
         }catch (Exception e){
             throw new MailSendException("Unable to send messages");
         }
    }

    @Override
    public void send(MimeMessagePreparator mimeMessagePreparator) throws MailException {
            try {
                super.send(mimeMessagePreparator);
            }catch(Exception e){
                throw new MailSendException("Unable to send message");
            }
    }

    @Override
    public void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException {
        try {
            super.send(mimeMessagePreparators);
        }catch(Exception e){
            throw new MailSendException("Unable to send messages");
        }
    }

    @Override
    public void send(SimpleMailMessage simpleMailMessage) throws MailException {
        try {
            super.send(simpleMailMessage);
        }catch(Exception e){
            throw new MailSendException("Unable to send message");
        }
    }

    @Override
    public void send(SimpleMailMessage... simpleMailMessages) throws MailException {
        try {
            super.send(simpleMailMessages);
        }catch(Exception e){
            throw new MailSendException("Unable to send messages");
        }
    }
}
