package br.com.santander.agenda.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.santander.agenda.modelo.Evento;
import br.com.santander.agenda.modelo.Notificacao;
import br.com.santander.agenda.modelo.Usuario;

public class EventoDto {
	
	private int id;
	private LocalDateTime data = LocalDateTime.now();
	private String titulo;
	private String Descricao;
	private Usuario organizador;
	private List<Usuario> covidados = new ArrayList<>();	
	private List<Notificacao> notificacao= new ArrayList<Notificacao>();
	
	public EventoDto(Evento evento) {
		this.id=evento.getId();
		this.data=evento.getData();
		this.titulo=evento.getTitulo();
		this.Descricao=evento.getDescricao();
		this.organizador=evento.getOrganizador();
		this.covidados=evento.getConvidados();
		this.notificacao=evento.getNotificacao();
	}
	
	public List<Notificacao> getNotificacao() {
		return notificacao;
	}

	public Usuario getOrganizador() {
		return organizador;
	}
	
	public List<Usuario> getCovidados() {
		return covidados;
	}
	public int getId() {
		return id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return Descricao;
	}

	public static List<EventoDto> Converter(List<Evento>evento) {
		
		return evento.stream().map(EventoDto::new).collect(Collectors.toList());
	}

}


