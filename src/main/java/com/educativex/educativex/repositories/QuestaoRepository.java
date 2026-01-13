package com.educativex.educativex.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educativex.educativex.entities.Questao;

public interface QuestaoRepository extends MongoRepository<Questao, Long>{

}
