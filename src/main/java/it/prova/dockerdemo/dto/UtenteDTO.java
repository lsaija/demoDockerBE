package it.prova.dockerdemo.dto;

import java.util.List;
import java.util.stream.Collectors;

import it.prova.dockerdemo.model.Utente;

public class UtenteDTO {
	private Long id;
	private String nome;
	private String cognome;

	public UtenteDTO() {
	}

	public UtenteDTO(Long id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	/*
	 * BUILD BASE UTENTE
	 * 
	 */

	public Utente buildUtenteModel() {
		Utente result = new Utente(this.id, this.nome, this.cognome);

		return result;
	}

	public static UtenteDTO buildUtenteDTOFromModel(Utente utenteModel) {
		UtenteDTO result = new UtenteDTO(utenteModel.getId(), utenteModel.getNome(), utenteModel.getCognome());
		return result;
	}

	public static List<UtenteDTO> createUtenteDTOListFromModelList(List<Utente> modelListInput) {
		return modelListInput.stream().map(utenteEntity -> {
			UtenteDTO result = UtenteDTO.buildUtenteDTOFromModel(utenteEntity);
			return result;
		}).collect(Collectors.toList());
	}
}
