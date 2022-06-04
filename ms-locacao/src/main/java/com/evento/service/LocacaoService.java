package com.evento.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evento.entity.Locacao;
import com.evento.feignClients.LocalFeignClient;
import com.evento.repository.LocalRepository;

@Service
public class LocacaoService {
   @Autowired
   LocalRepository repository;
   
   @Autowired
   LocalFeignClient localFeignClient;
   
   public List<Locacao> getAll(){
	   return repository.findAll();
   }
   
   private Locacao getOne(Long id) {
	   Optional<Locacao> opt = repository.findById(id);
	   Locacao local = opt.orElseThrow(() ->new EntityNotFoundException("Local não existe"));
	   return local;
   }
   
  public Locacao save(Locacao locacao) {
	  localFeignClient.reservar(locacao.getLocal(), true);
	  return repository.save(locacao);
  }
   
}
