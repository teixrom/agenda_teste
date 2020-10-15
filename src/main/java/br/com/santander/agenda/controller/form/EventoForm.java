package br.com.santander.agenda.controller.form;

import java.util.ArrayList;
import java.util.List;

import br.com.santander.agenda.modelo.Evento;
import br.com.santander.agenda.modelo.Usuario;
import br.com.santander.agenda.repository.EventoRepository;
import br.com.santander.agenda.repository.UsuarioRepository;

public class EventoForm {

	private String titulo;
	private String descricao;
	private String nomeorganizador;
	private String nomeconvidado;
	
	
	
	public String getOrganizador() {
		return nomeorganizador;
	}
	public void setOrganizador(String organizador) {
		this.nomeorganizador = nomeorganizador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Evento converter(UsuarioRepository usuariorepository) {
		
		Usuario dataorganizador= usuariorepository.findBynome(nomeorganizador);
		Usuario dataconvidado= usuariorepository.findBynome(nomeconvidado);
		
		List<Usuario> convidados = new ArrayList<Usuario>();
		convidados.add(dataorganizador);
		convidados.add(dataconvidado);
		
		return new Evento(titulo,descricao,dataorganizador,convidados);
	}
}
