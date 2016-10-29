package br.com.froli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.froli.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
