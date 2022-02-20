package com.ayoub.microservices.service.impl;

import com.ayoub.microservices.Projet;
import com.ayoub.microservices.repositry.Projetrepositry;
import com.ayoub.microservices.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("projetService")
public class ProjetServciceImpl  implements ProjetService {

    @Autowired
    private Projetrepositry projetrepositry;

    @Override
    public Projet projetGetService(Integer id_projet) {
        return projetrepositry.projetGetrepo(id_projet);
    }

    @Override
    public Projet projetAddService(Projet projet) {
        projetrepositry.projetAddSrepo(projet);
        return projetrepositry.projetGetrepo(projet.getId_projet());
    }

    @Override
    public Projet projetUpdateService(Integer id_projet, Projet projet) {
        projetrepositry.projetUpdaterepo(id_projet,projet);

        return projetrepositry.projetGetrepo(id_projet);
    }

    @Override
    public String projetDeleteService(Integer id_projet) {
        return projetrepositry.projetDeleterepo(id_projet);
    }
}
