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

    @GetMapping("/area 3")
    public String area3(){
        return "area 3";
    }

    @GetMapping("/area 4")
    public String area4(){
        return "area 4";
    }

    @GetMapping("/area 5")
    public String area5(){
        return "area 5";
    }

    @GetMapping("/area 6")
    public String area6(){
        return "area 6";
    }

    @GetMapping("/area 7")
    public String area7(){
        return "area 7";
    }

    @GetMapping("/area 8")
    public String area8(){
        return "area 8";
    }

    @GetMapping("/area 9")
    public String area9(){
        return "area 9";
    }

    @GetMapping("/area 10")
    public String area10(){
        return "area 10";
    }

    @GetMapping("/webservice")
    public String webservice(){
        return "webservice";
    }

}

