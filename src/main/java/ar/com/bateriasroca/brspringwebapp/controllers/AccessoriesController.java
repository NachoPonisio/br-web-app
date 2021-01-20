package ar.com.bateriasroca.brspringwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessoriesController {

    @RequestMapping("/accessorios.html")
    public String getAccessories(){
        return "accesorios";
    }
}
