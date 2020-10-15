package br.com.santander.agenda.controller.dto;

import br.com.santander.agenda.modelo.Evento;
import br.com.santander.agenda.modelo.Usuario;

public class UsuarioDto {


	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	
	public UsuarioDto(Usuario Usuario) {
		this.id=Usuario.getId();
		this.nome=Usuario.getNome();
		this.email=Usuario.getEmail();
		this.telefone=Usuario.getTelefone();
	}
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	


}
