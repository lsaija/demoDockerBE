package it.prova.dockerdemo.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.dockerdemo.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
