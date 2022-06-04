package com.evento.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evento.entity.Local;
import com.evento.repository.LocalRepository;

@Service
public class LocalService {
   @Autowired
   LocalRepository repository;
   
   public List<Local> getAll(){
	   return repository.findAll();
   }
   
   private Local getOne(Long id) {
	   Optional<Local> opt = repository.findById(id);
	   Local local = opt.orElseThrow(() ->new EntityNotFoundException("Local não existe"));
	   return local;
   }
   
   public Local reservar(Long id, boolean acao) {
	   Local local = this.getOne(id);
	   local.setOcupado(acao);
	   repository.save(local);
	   return local;	   
   }
}
