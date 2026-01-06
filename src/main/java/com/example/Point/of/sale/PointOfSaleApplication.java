package com.example.Point.of.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Classe principale de l'application Point of Sale.
 * Cette classe initialise et lance l'application Spring Boot.
 * @author Ilyas MICHICH
 * @version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PointOfSaleApplication {
	/**
	 * Point d'entrée principal de l'application.
	 * Démarre le contexte Spring Boot.
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		SpringApplication.run(PointOfSaleApplication.class, args);
	}
}
