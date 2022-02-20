package com.ayoub.microservices.service;

import com.ayoub.microservices.Projet;

public interface ProjetService {

    public Projet projetGetService(Integer id_projet);
    public Projet projetAddService(Projet projet);
    public Projet projetUpdateService(Integer id_projet,Projet projet);
    public String projetDeleteService(Integer id_projet);
}
