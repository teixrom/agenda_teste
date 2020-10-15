package br.com.santander.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.agenda.modelo.Evento;

public interface EventoRepository  extends JpaRepository<Evento,Integer>{

	List<Evento> findBytitulo(String nomeEvento);

	
	
}