package ar.com.bateriasroca.brspringwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BatteriesController {

    @RequestMapping("/baterias.html")
    public String getBatteries(){
        return "baterias";
    }
}
