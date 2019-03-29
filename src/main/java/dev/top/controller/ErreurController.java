package dev.top.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import dev.top.exception.TopColleguesException;

@ControllerAdvice
public class ErreurController {

	@ExceptionHandler(TopColleguesException.class)
	public ResponseEntity<?> erreur(Throwable ex) {
		return ResponseEntity.badRequest().body(ex.getMessage());
	}
}