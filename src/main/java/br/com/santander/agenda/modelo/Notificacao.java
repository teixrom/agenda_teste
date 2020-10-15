package br.com.santander.agenda.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notificacao {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dataenvio = LocalDateTime.now();
	private String tipo ;
	@ManyToOne
	private Evento eventonotificacao;
	
	
	
	public LocalDateTime getDataenvio() {
		return dataenvio;
	}
	public void setDataenvio(LocalDateTime dataenvio) {
		this.dataenvio = dataenvio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
