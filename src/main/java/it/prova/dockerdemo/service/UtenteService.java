package it.prova.dockerdemo.service;

import java.util.List;

import it.prova.dockerdemo.model.Utente;

public interface UtenteService {

	public List<Utente> listAllUtenti();

	public Utente caricaSingoloUtente(Long id);
	
	public void inserisciNuovo(Utente utenteInstance);

}
