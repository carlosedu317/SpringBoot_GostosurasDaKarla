package br.com._denao4de.GostosurasDaKarla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com._denao4de.GostosurasDaKarla.model.Usuario;

public interface UsuarioRepository extends JpaRepository < Usuario, Long> {
    
}
