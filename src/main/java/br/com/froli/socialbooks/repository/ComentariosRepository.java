package br.com.froli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.froli.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
