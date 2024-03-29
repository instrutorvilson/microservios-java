package com.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evento.entity.Local;
import com.evento.service.LocalService;

@RestController
@RequestMapping("/local")
public class LocalController {
	@Autowired
	LocalService service;

	@GetMapping
	public ResponseEntity<List<Local>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}

	@GetMapping("/{idlocal}/reserva/{acao}")
	public ResponseEntity<String> reservar(@PathVariable("idlocal") Long idlocal, @PathVariable("acao") boolean acao) {
		return ResponseEntity.status(HttpStatus.OK).body(service.reservar(idlocal, acao));
	}
}
