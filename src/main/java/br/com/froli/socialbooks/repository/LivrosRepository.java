package br.com.froli.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.froli.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
