package br.com.froli.socialbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.froli.socialbooks.domain.Autor;
import br.com.froli.socialbooks.repository.AutoresRepository;
import br.com.froli.socialbooks.services.exceptions.AutorExistenteException;
import br.com.froli.socialbooks.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;
	
	public List<Autor> listar() {
		return autoresRepository.findAll();
	}
	
	public Autor salvar(Autor autor) {
		if(autor.getId() != null) {
			Autor autorExistente = autoresRepository.getOne(autor.getId());
			if(autorExistente != null) {
				throw new AutorExistenteException("O autor já existe.");
			}
		}
		
		return autoresRepository.save(autor);
	}
	
	public Autor buscar(Long id) {
		Autor autor = autoresRepository.findOne(id);
		
		if(autor == null) {
			throw new AutorNaoEncontradoException("Autor não encontrado.");
		}
		return autor;
	}
}
