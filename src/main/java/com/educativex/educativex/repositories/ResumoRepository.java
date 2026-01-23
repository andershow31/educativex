package com.educativex.educativex.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Resumo;

public interface ResumoRepository extends MongoRepository<Resumo, String>{

}
