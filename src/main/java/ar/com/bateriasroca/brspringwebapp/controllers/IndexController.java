package ar.com.bateriasroca.brspringwebapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {



    @RequestMapping({"", "/", "/index.html"})
    public String getIndex(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/submitEmail"})
    public String submitEmail(@RequestParam(name = "email") String email){
        System.out.println(email);

        return "redirect:index";
    }

}
