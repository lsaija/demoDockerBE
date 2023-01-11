package it.prova.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.dockerdemo.model.Utente;
import it.prova.dockerdemo.service.UtenteService;

@SpringBootApplication
public class DockerdemoApplication implements CommandLineRunner{
	
	@Autowired
	private UtenteService utenteServiceInstance;

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * CREAZIONE PERSONE 
		 *
		 **/
		
		Utente persona1 = new Utente(1L, "Franco", "Pippo");
		Utente persona2 = new Utente(2L, "Goku", "Son");
		Utente persona3 = new Utente(3L, "Peppe", "Carbonara");
		
		/*
		 * INSERIMENTO PERSONE
		 * 
		 * */
		
		utenteServiceInstance.inserisciNuovo(persona1);
		utenteServiceInstance.inserisciNuovo(persona2);
		utenteServiceInstance.inserisciNuovo(persona3);
	}

}
