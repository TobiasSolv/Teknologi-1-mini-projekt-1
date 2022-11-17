package com.example.teknologi1miniprojekt1.service;

import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class MiniProjektService {


    ØnskelisteRepository repo = new ØnskelisteRepository();

    public List<Ønskeliste> getØnskeliste(){

        return repo.getØnskelistes();
    }

    public void create(WebRequest req)  {

        Ønskeliste ønskeliste = new Ønskeliste(req.getParameter("wish"));

        repo.create(ønskeliste);
    }
}
