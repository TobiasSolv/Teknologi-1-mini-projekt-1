package com.example.teknologi1miniprojekt1.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

public class HomeController {



    @GetMapping("/homepage")
    public String getØnskeliste(Model model){
        model.addAttribute();
        return "";
    }

    @GetMapping("")
    public String index(){
        return "index";
    }

    @GetMapping("")
    public String create(WebRequest payload){
        service.create(payload);
        return "redirect:/";
    }

}
