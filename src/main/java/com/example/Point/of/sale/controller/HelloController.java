package com.example.Point.of.sale.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contrôleur REST pour les endpoints de base de l'application.
 * Gère les requêtes HTTP pour l'accueil, les utilisateurs et les présentations.
 * @author Ilyas MICHICH
 * @version 1.0
 */
@RestController
@RequestMapping("/")
public class HelloController {
    /**
     * Endpoint d'accueil de l'application.
     * @return message de bienvenue
     */
    @GetMapping
    public String hello() {
        return "Hello from New Test :)";
    }

    /**
     * Récupère les informations des utilisateurs.
     * @return chaîne représentant les utilisateurs
     */
    @GetMapping("/user")
    public String getUsers(){
        return "Users";
    }


    /**
     * Récupère la page de présentation.
     * @return chaîne représentant la présentation
     */
    @GetMapping("/presentation")
    public String getPresentation(){
        return "presentation";
    }

}
