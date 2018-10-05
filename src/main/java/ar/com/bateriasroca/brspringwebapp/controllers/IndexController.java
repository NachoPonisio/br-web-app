package ar.com.bateriasroca.brspringwebapp.controllers;


import ar.com.bateriasroca.brspringwebapp.services.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;


@Controller
public class IndexController {

    private OfferService offerService;

    public IndexController(OfferService offerService){
        this.offerService = offerService;
    }


    @RequestMapping({"", "/", "/index.html"})
    public String getIndex(){

        Iterator it = offerService.getAllOffers().iterator();

        while(it.hasNext()){
            System.out.println(it.next().toString());
        }

        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/submitEmail"})
    public String submitEmail(@RequestParam(name = "email") String email){
        System.out.println(email);

        return "redirect:index.html";
    }

}
