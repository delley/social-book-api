package br.com.froli.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.froli.socialbooks.services.LivroNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<Void> handlerLivroNaoEncontradoException(LivroNaoEncontradoException e, HttpServletRequest request) {
		return ResponseEntity.notFound().build();
	}
}
