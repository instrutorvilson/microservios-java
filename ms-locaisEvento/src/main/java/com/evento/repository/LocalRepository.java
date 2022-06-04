package com.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evento.entity.Local;

@Repository
public interface LocalRepository  extends JpaRepository<Local, Long>{

}
