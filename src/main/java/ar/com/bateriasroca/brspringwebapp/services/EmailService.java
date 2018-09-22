package ar.com.bateriasroca.brspringwebapp.services;

import org.springframework.stereotype.Component;


public interface EmailService {

    void sendEmail(String[] parameters);

}
