package ar.com.bateriasroca.brspringwebapp.controllers;

import ar.com.bateriasroca.brspringwebapp.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    private EmailService emailService;

    @Autowired
    public IndexController(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping({"", "/", "/index.html"})
    public String getIndex(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/submitEmail"})
    public String submitEmail(@RequestParam(name = "email") String email){
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo("bateriasroca.florida@gmail.com");
//        msg.setSubject("Nueva subscripción " + email);
//        msg.setText(email);
//        try{
//            emailService.send(msg);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return "index";
    }

}
