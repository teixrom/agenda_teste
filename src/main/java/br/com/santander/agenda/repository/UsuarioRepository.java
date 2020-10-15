package br.com.santander.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.santander.agenda.modelo.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario,Integer>{

	Usuario findBynome(String nome);

}
