package com.ayoub.microservices.repositry.impl;

import com.ayoub.microservices.Projet;
import com.ayoub.microservices.common.ProjetDB;
import com.ayoub.microservices.repositry.Projetrepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("projetRepository")
public class ProjetRepoImpl implements Projetrepositry {

    @Autowired
    private ProjetDB projetdb;

    @SuppressWarnings("static-access")
    @Override
    public Projet projetGetrepo(Integer id_projet) {
        return (Projet) projetdb.getIntance().map.get(id_projet);
    }

    @SuppressWarnings("static-access")
    @Override
    public Projet projetAddSrepo(Projet projet) {

        return (Projet) projetdb.getIntance().map.put(projet.getId_projet(), projet);
    }

    @SuppressWarnings("static-access")
    @Override
    public Projet projetUpdaterepo(Integer id_projet, Projet projet) {

        return (Projet) projetdb.getIntance().map.put(projet.getId_projet(), projet);
    }

    @SuppressWarnings("static-access")
    @Override
    public String projetDeleterepo(Integer id_projet) {
        projetdb.getIntance().map.remove(id_projet);
        return "Projet : " + id_projet + " successfully deleted from Projet DB";
    }
}
