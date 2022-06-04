package com.evento.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evento.entity.Locacao;
import com.evento.repository.LocalRepository;

@Service
public class LocacaoService {
   @Autowired
   LocalRepository repository;
   
   public List<Locacao> getAll(){
	   return repository.findAll();
   }
   
   private Locacao getOne(Long id) {
	   Optional<Locacao> opt = repository.findById(id);
	   Locacao local = opt.orElseThrow(() ->new EntityNotFoundException("Local não existe"));
	   return local;
   }
   
  public Locacao save(Locacao locacao) {
	  return repository.save(locacao);
  }
   
}
