package br.com.santander.agenda.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.*;

import br.com.santander.agenda.controller.dto.EventoDto;
import br.com.santander.agenda.controller.form.EventoForm;
import br.com.santander.agenda.modelo.Evento;
import br.com.santander.agenda.repository.EventoRepository;
import br.com.santander.agenda.repository.UsuarioRepository;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	
	@Autowired
	private EventoRepository eventorepository;
	@Autowired
	private UsuarioRepository usuariorepository;
	
	
	@GetMapping
	public List<EventoDto> lista(String nomeEvento) {
		
		if(nomeEvento==null) {
		List<Evento> eventos=eventorepository.findAll();
		return EventoDto.Converter(eventos);
		}
		else {
			List<Evento> eventos=eventorepository.findBytitulo(nomeEvento);
			return EventoDto.Converter(eventos);
		}
	}
	@PostMapping
	public ResponseEntity<EventoDto> Cadastrar(@RequestBody EventoForm form, UriComponentsBuilder uriBuilder) {
		
		Evento evento=form.converter(usuariorepository);
		eventorepository.save(evento);
		
		URI uri=uriBuilder.path("/eventos/{id}").buildAndExpand(evento.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new EventoDto(evento));
	}
	
	
}
