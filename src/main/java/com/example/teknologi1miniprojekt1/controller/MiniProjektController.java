package com.example.teknologi1miniprojekt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiniProjektController {

    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/area 1")
    public String area1(){
        return "area 1";
    }

    @GetMapping("/area 2")
    public String area2(){
        return "area 2";
    }

    @GetMapping("/area 2")
    public String area3(){
        return "area 2";
    }

    @GetMapping("/area 2")
    public String area4(){
        return "area 2";
    }

    @GetMapping("/webservice")
    public String webservice(){
        return "webservice";
    }

}

