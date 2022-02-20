package com.ayoub.microservices.common;

import com.ayoub.microservices.Projet;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProjetDB {
    public static ProjetDB projetdb = null;
    public static Map<Integer, Projet> map;


    private ProjetDB() {
        map = new HashMap<Integer, com.ayoub.microservices.Projet>();

    }

    public static ProjetDB getIntance() {
        if (projetdb == null)
            projetdb = new ProjetDB();
        return projetdb;

    }
}
