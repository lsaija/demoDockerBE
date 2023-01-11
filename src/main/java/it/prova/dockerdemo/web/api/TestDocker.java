package it.prova.dockerdemo.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prova.dockerdemo.dto.UtenteDTO;
import it.prova.dockerdemo.model.Utente;
import it.prova.dockerdemo.service.UtenteService;

@RestController
@RequestMapping("/")
public class TestDocker {

	@Autowired
	private UtenteService utenteService;

	@RequestMapping("/ciao")
	@GetMapping
	public String test() {
		return "ciao";
	}

	@GetMapping
	public List<UtenteDTO> getAll() {
		return UtenteDTO.createUtenteDTOListFromModelList(utenteService.listAllUtenti());
	}

	@GetMapping("/{id}")
	public UtenteDTO findById(@PathVariable(value = "id", required = true) long id) {
		Utente utente = utenteService.caricaSingoloUtente(id);
		return UtenteDTO.buildUtenteDTOFromModel(utente);
	}

}
