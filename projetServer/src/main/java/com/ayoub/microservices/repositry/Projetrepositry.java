package com.ayoub.microservices.repositry;

import com.ayoub.microservices.Projet;

public interface Projetrepositry {

    public Projet projetGetrepo(Integer id_projet);
    public Projet projetAddSrepo(Projet projet);
    public Projet projetUpdaterepo(Integer id_projet,Projet projet);
    public String projetDeleterepo(Integer id_projet);
}
