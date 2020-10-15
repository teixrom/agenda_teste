package br.com.santander.agenda.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity

public class Evento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	
	private int id;
	private LocalDateTime data = LocalDateTime.now();
	private String titulo;
	private String Descricao;
	@ManyToOne
	private Usuario organizador;
	@OneToMany(mappedBy = "evento")
	private List<Usuario> convidados = new ArrayList<Usuario>();
	
	@OneToMany(mappedBy = "eventonotificacao")
	private List<Notificacao> notificacao= new ArrayList<Notificacao>();

	public Evento() 
	{}

public Evento(String titulo,String descricao,Usuario organizador,List<Usuario> convidados) {
		
		this.titulo = titulo;
		this.Descricao = Descricao;
		this.organizador = organizador;
		this.convidados=convidados;
	}

	


	public List<Notificacao> getNotificacao() {
		return notificacao;
	}


	public void setNotificacao(List<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public LocalDateTime getData() {
		return data;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return Descricao;
	}


	public void setDescricao(String descricao) {
		Descricao = descricao;
	}


	public Usuario getOrganizador() {
		return organizador;
	}


	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}


	public List<Usuario> getConvidados() {
		return convidados;
	}


	public void setCovidados(List<Usuario> convidados) {
		this.convidados = convidados;
	}

	

}
